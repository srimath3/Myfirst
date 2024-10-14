package constructorconcept;

//initialize the object with constructing the method inside constructor(special method)

class Human
{
	
	
	private int age;
	private String name;
	
	//Default constructor
	public Human() {
		
		age = 13;
		name = "med";
	}
	// parametrized constructor method
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void show() {
		System.out.println("anonymous object");
	}
	
	
}
	
public class Demo {
		public static void main(String[] args) {
			
			Human human = new Human();  // referred object
			Human human1 = new Human(15,"sri");
			Human human2 = new Human(35,"srim");
			
		    System.out.println(human.getAge()+" " +human.getName());
		    System.out.println(human1.getAge()+" " +human1.getName());
		    System.out.println(human2.getAge()+" " +human2.getName());
		    
		    
		   // new Human().show();   anonymous object
		
		    
			

		    
		    
		  
			
		}

	}


