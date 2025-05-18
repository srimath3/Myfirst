package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	
	   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(candidates); // Sort candidates for optimization
	        backtrack(candidates, 0, target, new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
	    	
	        if (target == 0) {
	            // Found a valid combination
	            result.add(new ArrayList<>(current));
	            System.out.println("return pannu");
	            return ;
	            
	        }
	        for (int i = start; i < candidates.length; i++) {
	        	System.out.println(i+" "+start);
	            if(i>start && candidates[i]==candidates[i-1]) ///index exception
	            {
	            	 continue;	 
	            }
	            System.out.println(current+"munnadi"+i);
	            current.add(candidates[i]);
	            int newTar=target - candidates[i];
	            if(newTar>=0) {
	                      backtrack(candidates, i+1,newTar , current, result);
	            }
	                //[2,2,2] after remove [2,2]
	            current.remove(current.size() - 1);
	            System.out.println(current);
	           
	            // Backtrack
	        }

	    }
	    public static void main(String[] args) {
			 int[] candidates = {2,3,5,7};
		        int target = 8;
		        List<List<Integer>> combinations = combinationSum(candidates, target);
		            System.out.println(combinations);
		}

}
