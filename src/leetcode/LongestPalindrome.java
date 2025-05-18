package leetcode;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		   System.out.println(longestPalindrome("cmamad"));
	        
    }
	public static String longestPalindrome(String s) {
		int start=0;
		int maxLen=1;
		for(int i=0;i<s.length();i++) {
			
			
			
			int len=expandAroundCenter(s,i,i);
			int len1=expandAroundCenter(s,i,i+1);
			System.out.println(len+" "+len1);
			int curr=Math.max(len, len1);
			if (curr > maxLen) {
				maxLen = curr;
				
//				System.out.println(start+"inside"+maxLen);
		        start = i - (curr - 1) / 2;
//		        System.out.println(start);
		        
		      }
//			System.out.println(s.substring(start, start+maxLen)); 
			
		}
//		System.out.println(start+ " "+maxLen);
		return s.substring(start, start+maxLen);
		


        
        
    } 
	
	  private static int expandAroundCenter(String s, int left, int right) {
		    int n = s.length();

		    while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
		      left--;
		      right++;
		    }
            System.out.println("i"+ (right - left - 1));
		    return right - left - 1;
		  }
	    
	private boolean isPalindrome(String str)
    {
        StringBuilder str1= new StringBuilder(str);
        str1.reverse();
        if(str.equals(str1.toString()))
        {
            return true;
        }
        return false;
    }
    



}
