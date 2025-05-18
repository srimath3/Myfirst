package leetcode;
import java.util.Stack;

public class LongestVaildParenthesis {
public static void main(String[] args) {
		String str1 = "()())())(";
//		int diff = 0;
//		int start=0;
//		int maxLen=0;
//			for (int i = 0; i < str1.length(); i++) {
//                 char c=str1.charAt(i);
//                 if(c=='(')
//                 {
//                	 diff++;
//                 }
//                 else
//                 {
//                	 diff--;
//                 }if(diff<0)
//     			{
//     				diff=0;
//     				start=i+1;
//     				
//     			}
//     			 if(diff == 0) {
//     			        maxLen = Math.max(maxLen, i-start+1);
//     			    }
//                 
//			}
//			diff = 0;
//	        int end = str1.length()-1;
//	        // right to left scan
//	        for(int i = str1.length()-1; i >= 0; i--) {
//	            char c = str1.charAt(i);
//	            if(c == ')')diff++;
//	            else diff--;
//	            
//	            // reset start and diff
//	            if(diff < 0) {diff = 0;end=i-1;}
//	            
//	            if(diff == 0) {
//	                maxLen = Math.max(maxLen, end-i+1);
//	            }
//	        }
//	        System.out.println(maxLen);
//	    } 
         int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '(') {
                stack.push(i);
                System.out.println(i+"+");
            } else {
                stack.pop();
                System.out.println(str1.charAt(i));
                if (stack.empty()) {
                    stack.push(i);
                    System.out.println(i+"l");
                    
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        System.out.println(maxLen); 
    }
		
        
	
}
