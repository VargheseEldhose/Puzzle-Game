package ca.sheridancollege.searchWord;

import ArrayDetails.Details;
import ca.sheridancollege.FillArray.Fill;
import ca.sheridancollege.word.Word;

public class Search {
	
	
	public int searchWord(Word w)
	
	{   System.out.println(w.getWord());
	    System.out.println(Details.side);
	   int d=Details.side;
	    int res=0;
	    for(int i=0;i<d;i++)
	    {
	    	for(int j=0,c=0;j<d;j++)
	    	{ int h=0;
	    	   res=1;
	    	   while(h<w.getWord().length&&res==1)
	    	   {
	    		if(w.getWord()[h]==Fill.getA()[i][j])
	    		{   ++h;
	    		    c=j;
	    		    while(h<w.getWord().length&&res==1)
	    		    {
	    		    	++c;
	    			  if(w.getWord()[h]==Fill.getA()[i][c])
	    			      {    ++h;
	    			           	res=1;
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
