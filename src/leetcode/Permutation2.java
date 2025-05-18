package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
	
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		System.out.println(permute(nums));
		
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        backtrack(nums,new boolean[nums.length],new ArrayList<>(),result);
        return result;
        
    }

    private static void backtrack(int[] nums,boolean[] used,List<Integer> li,List<List<Integer>> result)
    { 
        if(li.size()==nums.length) 
        {
            result.add(new ArrayList<Integer>(li));
            System.out.println(li);
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
        	
        	
        	if(used[i]==true || (i>0 && nums[i]==nums[i-1] && used[i-1]!=true))
        	{
        		System.out.println(i);
        		continue;
        	}
           
            used[i]=true;
            System.out.println(li);
            li.add(nums[i]);
            System.out.println("inside boolean"+i);
            
            backtrack(nums,used,li,result);
            
            li.remove(li.size()-1);
            used[i]=false;
        }
    }

}
