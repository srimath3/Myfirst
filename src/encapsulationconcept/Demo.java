package encapsulationconcept;


// hide object data from real world.
class Human
{
	/*private int age=15;
	private String name="sri";
	*/
	
	private int age;
	private String name;
	public void setAge(int a) {
		age = a;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// 'this' refers current object
	 public void setName(String name,Human human) {
	 Human human1 = human;
	 human1.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
}
public class Demo {
	public static void main(String[] args) {
		Human human = new Human();
		human.setAge(35);
		human.setName("sri");
	    System.out.println(human.getAge()+" " +human.getName());
		

	    
	    human.setName("sri",human);
	    System.out.println(human.getAge()+" " +human.getName());
		
	}

}
