package leetcode;

public class NextPermutation {
	
	public static void nextPermutation(int[] nums) {
		int pivot =nums.length-2;
        while(pivot>=0 && nums[pivot]>=nums[pivot+1])
        {
            pivot--;
        }
        if(pivot>=0){
        for(int j=nums.length-1;j>pivot;j--)
        {
            if(nums[j]>nums[pivot])
            {
                swap(nums,pivot,j);
                break;
            }
           
        }}
         reverse(nums,pivot+1,nums.length-1);




        
    }
	public static void main(String[] args) {
		int[] listOfNums = {1,2,3};
		nextPermutation(listOfNums);
	}
		 

    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }

    }
     public static void swap(int[] nums,int start,int end)
    {
        int temp =nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

    }

}
