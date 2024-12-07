package TypeCastAndWrapper;

class A{
    public void show(){
    System.out.println("A  ");
    }
}

class B extends A{
    public void show1(){
        System.out.println("B ");
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        A obj= new B();
        obj.show();      // upcasting

        // executing child obj through parent class.
        B obj1 = (B) obj;
        obj1.show1();   // downcasting

        double i= 5.5;
        int j = (int) i;
        System.out.println(j); //typecasting





    }
}
