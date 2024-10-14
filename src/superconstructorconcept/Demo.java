package superconstructorconcept;

/*
// without super class and this class 
class A {
	public A() {
		System.out.println("A");
	}

	public A(int n) {
		System.out.println("A n");
	}

}

class B extends A {
	public B() {
		System.out.println("B");
	}
	public B(int n)
	{
		System.out.println("B n");	}

}

// return A and B
 */


// with super class and this class
class A {
	public A() {
		super();
		System.out.println("A");
	}

	public A(int n) {
		this();
		System.out.println("A n");
	}

}

class B extends A {
	public B() {
		super(5);   // super(5) return A n and B
		System.out.println("B");
	}
	public B(int n)
	{
		this();
		System.out.println("B n");	}

}

public class Demo {
	public static void main(String[] args) {
		B b = new B(5);

	}

}
