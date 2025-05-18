package leetcode;

public class CanFlowerPlaced {
	public static void main(String[] args) {
		int[] arr={1,0,0,0,0,0,1};
		System.out.println(canPlaceFlowers(arr, 2));
	}
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 
		    if (n == 0)
		      return true;

		    for (int i = 0; i < flowerbed.length; ++i)
		    	/*f[0]==0  && f[0-1]==0 || i==0  && i==4 || f[1]=0
		    	 *f[1]==0 && f[1-1]==0 || i!=0 && i==4 || f[2]=0*/
		    	
		      if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
		          (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
		        flowerbed[i] = 1;
		       
		        if (--n == 0) {
		          return true;
		        }
		      }

		    return false;
		  }

}
