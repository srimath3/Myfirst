package staticconcept;


class Mobile{
	static String name;
	int count;
	String brand;
	
	public void MobileService() {
	       System.out.println(brand+":"+count+":"+name);
	}
	
	//static variable only used in static method  but non static variable can be used by static method by referring object
	
	public static void MobileService1(Mobile mobile) {
	       System.out.println(mobile.brand+":"+mobile.count+":"+name);
	}
	
}


public class Demo {
	public static void main(String[] args) {
		Mobile mobile= new Mobile();
		mobile.brand="Vivo";
		mobile.count=5;
		Mobile.name="AndriodPhone";
		
		Mobile mobile1 = new Mobile();
		mobile1.brand="Oppo";
		mobile1.count=10;
		mobile1.name="AndriodPhone";
		
		
		mobile.MobileService();
		Mobile.MobileService1(mobile);
		
		
	}

}
