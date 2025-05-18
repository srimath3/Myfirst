package leetcode;

public class FirstOccInTwoString {
	public static void main(String[] args) {

		String needle = "sad";
		String haystack = "sadbsad";
		 int haylength=haystack.length();
	        int needlelength=needle.length();
	        if(haylength<needlelength)
	        {
	            System.out.println("-1");
	        }
	        for(int i=0;i<haystack.length()-needle.length()+1;i++){
	            int j=0;
	            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
	                j++;
	            if(j==needle.length()){
	            	System.out.println(i);
	            }
	        }
	        System.out.println("-1");

	}

}
