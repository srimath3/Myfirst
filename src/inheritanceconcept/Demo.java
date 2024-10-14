package inheritanceconcept;


// Without java file ,we can execute with class with the use of inheritance

// AdvCalc (Parent class ,super class, main class)
// Calc (Child class, sub class, derived class)
// VeryAdvCalc - multi level inheritance
public class Demo {
	public static void main(String[] args) {
		VeryAdvClac calc = new VeryAdvClac();
		int r1= calc.add(3,7);
		int r2= calc.sub(7,3);
		int r3= calc.multi(7,3);
		int r4= calc.div(7,3);
		double r5= calc.power(2,4);
		System.out.println(r1+ " " +r2 + " " +(r1 + r2));
		System.out.println(r3+ " " +r3 + " " +(r3 - r4));
		System.out.println(r5);
		
	}

}
