package ca.sheridancollege.userDetails;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7717893653267822509L;
	
	String userName;
	int age;
	int uniqueKey;
	
	
	

}
