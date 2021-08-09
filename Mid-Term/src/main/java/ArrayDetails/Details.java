package ArrayDetails;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class Details implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8965022503118706850L;
	
	 public static int side;
	 Details(int s)
	 {
		 Details.side=s;
	 }

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		Details.side = side;
	}
  
	
}
