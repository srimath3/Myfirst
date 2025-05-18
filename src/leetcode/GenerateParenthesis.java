package leetcode;
import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public static void main(String[] args) {
		System.out.println(genParen(3));	
	}
	
	public static List<String> genParen(int n)
	{
		List<String> ans=new ArrayList<>();
		generate(n,n,new StringBuilder(),ans);
		return ans;
	}
	private static void generate(int start,int end,StringBuilder str,List<String> ans)
	{
		if(start==0 && end==0)
		{
			
			ans.add(str.toString());
			System.out.println(ans);
			return;	
		}
		
		if(start>0)
		{
			str.append("(");
			System.out.println("inside"+start+" "+end);
			generate(start-1,end,str,ans);
			System.out.println(start+" "+end);
			str.deleteCharAt(str.length()-1);
			System.out.println(str.length() +"jg");
			
	
		}
		System.out.println("after first");
		
		if(start<end)
		{
			str.append(")");
			System.out.println("inside"+start+" "+end);
			generate(start,end-1,str,ans);
			System.out.println(start+" "+end);
			
			str.deleteCharAt(str.length()-1);
			System.out.println(str);
			System.out.println(str.length() +"jg2");
	
		}
		System.out.println("outside"+start+" "+end);
		System.out.println("after two");
		
		
		
	}

}
