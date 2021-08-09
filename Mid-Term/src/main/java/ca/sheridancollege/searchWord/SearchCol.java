package ca.sheridancollege.searchWord;

import ArrayDetails.Details;
import ca.sheridancollege.FillArray.Fill;
import ca.sheridancollege.word.Word;

public class SearchCol {
	
		
		public int searchCol(Word w)
		
		{   System.out.println(w.getWord());
		    System.out.println(Details.side);
		   int d=Details.side;
		    int res=0;
		    for(int i=0,r=0;i<d;i++)
		    {
		    	for(int j=0;j<d;j++)
		    	{ int h=0;
		    	   res=1;
		    	   while(h<w.getWord().length&&res==1)
		    	   {
		    		if(w.getWord()[h]==Fill.getA()[i][j])
		    		{   ++h;
		    		    r=i;
		    		    while(h<w.getWord().length&&res==1)
		    		    {
		    		    	++r;
		    			  if(w.getWord()[h]==Fill.getA()[r][j])
		    			      {
		    			           ++h;	res=1;
		    			             if(h==w.getWord().length)
		    			                    {
		    				                       i=d;
		    				                       j=d;
		    			                     }
		    			   
		    			   
		    			      }
		    			      else
		    			         { res=0;}
		    		    }
		    		}
		    		else 
		    		{res=0;}
		    	   }
		    	}
		    }
		    
			return res;
		}
}
