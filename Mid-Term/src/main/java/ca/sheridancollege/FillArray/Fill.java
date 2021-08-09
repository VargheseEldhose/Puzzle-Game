package ca.sheridancollege.FillArray;

import ArrayDetails.Details;

public class Fill {
public Fill() {
		
		
	}

	 static char a[][]=new char[10][10];
	public static char[][] getA() {
		return a;
	}


	public static void setA(char[][] a) {
		Fill.a = a;
	}

	Details d=new Details();
	
	
	public void fillArray(Details d)
	{ System.out.println(d.getSide());
		for(int i=0;i<d.getSide();i++)
		{ System.out.println();
			for(int j=0;j<d.getSide();j++)
			{
				a[i][j]=(char) ((Math.random()*25)+65);
				System.out.print(a[i][j]+" " );
				
			}
		}
	}

}
