package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		System.out.println(wordBreak("applepenappl",Arrays.asList("apple","pen","appl")));
		
	}
	
	

	public static boolean wordBreak(String s, List<String> wordDict) {


        Set<String> newHashSet = new HashSet<>(wordDict);
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
            	System.out.println(s.substring(j,i));
                    if(dp[j] && newHashSet.contains(s.substring(j,i)))
                    {
                        dp[i]=true;
                        break;
                    }
            }
        }
        return dp[s.length()];

        
    }

}
