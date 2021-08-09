package ca.sheridancollege.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ArrayDetails.Details;
import ca.sheridancollege.FillArray.Fill;
import ca.sheridancollege.searchWord.Search;
import ca.sheridancollege.searchWord.SearchCol;
import ca.sheridancollege.searchWord.SearchColrev;
import ca.sheridancollege.searchWord.SearchDiag;
import ca.sheridancollege.searchWord.SearchDiagrev;
import ca.sheridancollege.searchWord.Searchrev;
import ca.sheridancollege.userDatabase.User_database;
import ca.sheridancollege.userDetails.User;
import ca.sheridancollege.word.Word;


@Controller
public class HomeController {
Fill f= new Fill();
Details d=new Details();
Search s=new Search();
SearchCol scol=new SearchCol();
SearchColrev sColrev= new SearchColrev();
SearchDiag sdiag=new SearchDiag();
SearchDiagrev sdiagrev =new SearchDiagrev();
Searchrev srev=new Searchrev();
@Autowired
private User_database ud=new User_database();

	
	@GetMapping("/side")
	public String size(Model m)
	{  
		m.addAttribute("side", d);
		
		return "Add.html";
	}
	
	
	@GetMapping("/")
	public String DatabaseForm(Model m)
	{  
		m.addAttribute("user", new User());
		
		return "User.html";
	}
	
	
	@GetMapping("/database")
	public String dataStore(@ModelAttribute User u,Model m)
	{   System.out.println(u.getAge()+" "+u.getUserName()+" "+u.getUniqueKey());
	    User u2=new User(u.getUserName(),u.getAge(),u.getUniqueKey());
		ud.addData(u2);
		m.addAttribute("userdata",u);
		return "home.html";
	}
	
	
	@GetMapping("/view")
	public String view(Model m,@ModelAttribute Details d)
	{  
		if(d.getSide()<5)
	       {
			  m.addAttribute("side",d);
	          return "Add.html";
	       }
	  
		else {
		       f.fillArray(d);
	    
	          m.addAttribute("array", Fill.getA()); 
	     	  return "view.html";
	         }
	}
	
	
	@GetMapping("/search")
	public String searchWord(Model m)
	
	{   m.addAttribute("word",new Word());
		return "search.html";
	}
	
	@GetMapping("/result")
	public String viewResult(@ModelAttribute Word w)
	{
	  int flag=s.searchWord(w);
	  int flag2=scol.searchCol(w);
	  int flag3=sColrev.searchColRev(w);
	  int flag4=sdiag.searchDiag(w);
	  int flag5=sdiagrev.searchDiagRev(w);
	  int flag6=srev.searchRev(w);
	  
		if(flag==1||flag2==1||flag3==1||flag4==1||flag5==1||flag6==1) {
	
		return "Success.html";}
	else
		{return "Failed.html";}
	}
	
	@GetMapping("/thankyou")
	public String end()
	{
		return "Thankyou.html";
	}
	
}
