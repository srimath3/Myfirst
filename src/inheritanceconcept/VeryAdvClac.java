package inheritanceconcept;


// multi level inheritance - AdvCalc call Calc then VeryAdvCalc call AdvCalc
public class VeryAdvClac extends AdvCalc{
	public double power(int n1,int n2)
	{
		double r=Math.pow(n1, n2);
		return r;
	}

}
