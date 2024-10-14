package stringconcept;

public class Demo {
	public static void main(String[] args) {
		
		//mutable string
		
		String name = "sri"; // can also have object obj String(string:"sri")
		name = name + "math";
		String name1 = "srimath";
		String name2 = "srimath";
		
		System.out.println(name);
		System.out.println(name2==name1);
		
		//immutable string
		StringBuffer s = new StringBuffer("hen");
		s.append("kohli");
		System.out.println(s);
		
		
		System.out.println(s.capacity());
		System.out.println(s.reverse());
		System.out.println(s.deleteCharAt(3));
		System.out.println(s.insert(3,"o"));
		s.setLength(15); 
		System.out.println(s);
		
		

	}

}
