package threadconcept;

class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hiii");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

public class ThreadConcept {
	
	

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		
		obj1.start();
		obj2.start();
		

	}

}
