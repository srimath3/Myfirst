package leetcode;
import java.util.HashSet;
public class LongestSubset {
	public static void main(String[] args) {
		
		String s="srispkist";
		boolean[] ss = new boolean[128];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            char c = s.charAt(j);
            while (ss[c]) {
            	
                ss[s.charAt(i++)] = false;
                System.out.println(i+"I");
                
            }
            ss[c] = true;
            ans = Math.max(ans, j + 1 -i);
//            System.out.println(ans);
        }
        System.out.println(ans);
	}
	
	    public static boolean is_unique_within_range(String s, int start, int end) {
	        HashSet<Character> chars = new HashSet<>();
	        for (int i = start; i <= end; i++) {
	            char ch = s.charAt(i);
	            if (chars.contains(ch)) {
	            	System.out.println("not processed");
	                return false;
	            }
	            chars.add(ch);
	            System.out.println(ch);
	        }
	        return true;
	    }
	    public static int length_of_longest_substring(String s) {
	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i; j < s.length(); j++) {
	                if (is_unique_within_range(s, i, j)) {
	                    result = Math.max(result, j - i + 1);
	                    System.out.println(result);
	                }
	            }
	        }
	        return result;
	    }

}
