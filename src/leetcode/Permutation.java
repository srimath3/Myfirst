package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		int[] nums= {5,3,1,4};
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
            result.add(new ArrayList<>(li));
            System.out.println(li);
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
        	if(used[i])
        	{
        		continue;
        	}
           
            used[i]=true;
            System.out.println(li);
            li.add(nums[i]);
            System.out.println("inside boolean"+i);
            
            backtrack(nums,used,li,result);
            
            li.remove(li.size()-1);
            System.out.println("---");
            used[i]=false;
        }
    }

}
