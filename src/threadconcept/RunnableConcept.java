package threadconcept;


class H implements Runnable
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			
			System.out.println("Hiii");
			try
			{
				Thread.sleep(10);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class G implements Runnable	{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(10);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableConcept {
	
	
	public static void main(String[] args) {
		
		Runnable obj1=new G();
		Runnable obj2=new H();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		
		

	}

}
