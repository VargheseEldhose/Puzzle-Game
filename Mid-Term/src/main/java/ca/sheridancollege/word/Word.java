package ca.sheridancollege.word;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Word implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4637842110601415252L;
	char word[];

}
