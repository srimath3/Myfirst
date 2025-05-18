package leetcode;
import java.util.ArrayList;
import java.util.List;

public class TwoSumIndex {

	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		System.out.println(sumIndex(arr, 6));
	}
	 public static List<Integer> sumIndex(int[] arr, int n) {
		 int sum=0;
		 List<Integer> twoSolList = new ArrayList<>();
		    for (int i = 0; i < arr.length; i++)
		    	for(int j=i+1;j<arr.length;j++)
		    	{
		    		if(n==arr[i]+arr[j])
		    		{System.out.println("inside");
		    			twoSolList.add(i);
		    			twoSolList.add(j);
		    		}
		  }
		    return twoSolList;

}


}
