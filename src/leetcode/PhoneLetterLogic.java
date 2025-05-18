package leetcode;
import java.util.ArrayList;
import java.util.List;

public class PhoneLetterLogic {
	public static void main(String[] args) {
		System.out.println(letterLogic("34"));
	
		
	}
	public static List<String> letterLogic(String digit)
	{
		List<String> ls=new ArrayList<>();
		if(digit.length()<0)
		{
			return ls;
		}
		ls.add("");
	
	   String[] digToLetter= new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	   for(char ch:digit.toCharArray())
	   {
		   // int h=ch-'2';'2' convert into 0 as num
		   String letter = digToLetter[ch-'2'];
           // System.out.println(letter); abc and def 
		   List<String> temp=new ArrayList<>();
		   for(String le:ls) {
			   
			   for(char ch1:letter.toCharArray())
			   {
				  
				   //(" "+a)
				   temp.add(le+ch1);
			
			   }
		   }
		   //added to the list
		   ls=temp;
		   System.out.println(ls);
	   }
	   return ls;
	
	}
}
