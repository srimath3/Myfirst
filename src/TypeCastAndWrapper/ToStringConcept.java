package TypeCastAndWrapper;


import java.util.Objects;

class Laptop{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return total == laptop.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }

    public String name;
    public String model;
    public int total;
    public String toString()
    {
        return (name+" "+model+" " +total);
    }

    public boolean equals(Laptop lap3)
    {
        String lap2a = this.name;
        String lap2b = this.model;
        if(lap2a.equals(lap3.name) || lap2a.equals(lap3.model))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

public class ToStringConcept {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.name="Lenovo";
        lap1.model="notstarmake";

        Laptop lap2 = new Laptop();
        lap2.name="Lenovo";
        lap2.model="starmake";

        //override the super class
        //System.out.println(lap1.toString() + " " +lap2.toString());
        System.out.println(lap1.equals(lap2));



    }
}