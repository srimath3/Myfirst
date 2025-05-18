package leetcode;

public class ATOIConvert {
	public static void main(String[] args) {
		System.out.println(aToi("42"));

	}

	public static int aToi(String s) {
		  if( s==null || s.length()==0)
	        {
	            return 0;
	        }
	        int i=0;
	        while(s.charAt(i) ==' ')
	        {
	            if(++i==s.length())
	            	
	            {
	                return 0;
	            }
	        }
	        int sym=1,f=Integer.MAX_VALUE/10;
	        if(s.charAt(i)=='-')
	        {
	            sym=-1;
	        }
	        if(s.charAt(i)=='-' || s.charAt(i)=='+')
	        {
	        
	            ++i;
	      
	        }
	        int total=0;
	        for(;i<s.length();i++)
	        	
	        {
	        	
	            if(s.charAt(i)<'0' || s.charAt(i)>'9')
	            {
	                break;
	            }
	            if(total>f || (total==f && s.charAt(i)>'7'))
	            {
	                return sym>0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            System.out.println(total);
	            total=total*10 + s.charAt(i)-'0';
	            
	        }

	        return total*sym;
	        
	        
	    }

}
