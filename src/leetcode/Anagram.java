package leetcode;

public class Anagram {
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("gaauam","uamaag"));
		
	}
	
	public static boolean isAnagram(String s,String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		int[] c= new int[100];
		for(int i=0;i<s.length();i++)
		{
			c[s.charAt(i)-'a']++;
//			System.out.println(s.charAt(i)-'a');
//			System.out.println("s"+c[s.charAt(i)-'a']);
//			
			c[t.charAt(i)-'a']--;
//			System.out.println(t.charAt(i)-'a');
//			System.out.println("t"+c[t.charAt(i)-'a']);
//			
		}
		for(int co:c)
		{
			System.out.println(co);
			if(co!=0)
			{
				
				return false;
			}
			
		}
		return true;
	
		
		
	}

}
