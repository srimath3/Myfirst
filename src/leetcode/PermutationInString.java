package leetcode;

public class PermutationInString {
	
	public static void main(String[] args) {
		
		System.out.println(checkInclusion("ab","dfadba"));
		
	}
	
	 public static boolean checkInclusion(String s1, String s2) {
		    int[] count = new int[26];
		    int required = s1.length();

		    for (final char c : s1.toCharArray())
		    {
		      ++count[c - 'a'];
//		      System.out.println("o"+count[c - 'a']);
		    }

		    for (int l = 0, r = 0; r < s2.length(); ++r) {
		      if (--count[s2.charAt(r) - 'a'] >= 0)
		      {
//		    	  System.out.println("*****");
//		    	  System.out.println("i"+ s2.charAt(r) +count[s2.charAt(r) - 'a']);
		        --required;
//		        System.out.println("+++" +required);
//		        System.out.println("*****");
		      }
		      
		     
		      while (required == 0) {
		        if (r - l + 1 == s1.length())
		        {
//		        	System.out.println("jkkk"+l);
//		        	System.out.println("jkkk"+r);
		        	 return true;
		        }
		        
		        
		        
		        if (++count[s2.charAt(l) - 'a'] > 0)
		        {
		        	
//		        	System.out.println("///////");
//		        	System.out.println(count[s2.charAt(l++) - 'a']);
		          ++required;
//		          System.out.println("---"+required);
//		          System.out.println("///////");
		        }
		        
		       l++;
		      }
		    }

		    return false;
		  }

}
