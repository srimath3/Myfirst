package TypeCastAndWrapper;


public class Wrapper {
    public static void main(String[] args) {
        int num=3;
        Integer num1=num; //auto boxing
        int num2=Integer.parseInt("9");
        int num3=num; // auto unboxing
        System.out.println(num+" "+num1+" "+num2+" "+num3);

    }



}
