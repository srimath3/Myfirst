package leetcode;

public class MinSubArray {
	
	public static void main(String[] args) {

        int totalResult=Integer.MAX_VALUE;
       int nums[] = {1,3,4,6,8};
       int target=5;
        int left=0;

        int targetSum=0;
        for(int i=0;i<nums.length;i++)
        {
               totalResult+=nums[i];
               while(targetSum>=target)
               {
                totalResult=Math.min(totalResult,i+1-left);
               totalResult-=nums[i];
               left++;
               }


        }
        System.out.println((totalResult!=Integer.MAX_VALUE) ? totalResult:0);
	}

}
