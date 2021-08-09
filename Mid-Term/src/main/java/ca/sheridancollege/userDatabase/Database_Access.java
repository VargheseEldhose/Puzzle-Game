package ca.sheridancollege.userDatabase;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class Database_Access {
	@Bean
	public NamedParameterJdbcTemplate namedparameterjdbctemplate(DataSource datasource)
	{
		return new NamedParameterJdbcTemplate(datasource);
	}
	@Bean
public DataSource dataSource()
{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:mem:testdb");
    dataSource.setUsername("midterm");
    dataSource.setPassword("");
    return dataSource;
}
@Bean
public DataSource load()
{
	return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
			.addScript("classpath:schema.sql")
			 .build();
}

}
