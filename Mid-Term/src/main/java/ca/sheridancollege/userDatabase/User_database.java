package ca.sheridancollege.userDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import ca.sheridancollege.userDetails.User;
@Configuration
public class User_database {
	@Autowired
	NamedParameterJdbcTemplate jdbc;
		
		public void addData(User u) {
			System.out.println("hhhhhhhh"+u.getUserName());
			
			MapSqlParameterSource parameters= new MapSqlParameterSource();
			String query= "INSERT INTO UserInfo VALUES"+
			        "(:userName, :age, :key)";
			parameters.addValue("userName", u.getUserName());
			parameters.addValue("age", u.getAge());
			parameters.addValue("key", u.getUniqueKey());
			System.out.println("hhhhhhhh"+u.getUserName());	
		jdbc.update(query, parameters);
		}
	}



