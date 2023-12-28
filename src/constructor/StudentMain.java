package constructor;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("StuId");
		int stuid= sc.nextInt();
		System.out.println("StuName");
		sc.nextLine();
		String stuname= sc.nextLine();
		System.out.println("StuAddress");
		String stuaddress= sc.nextLine();
		while(true)
		{
			System.out.println("College name:(yes or no)");
			String condition= sc.nextLine();
			if(condition.equalsIgnoreCase("yes") || condition.equalsIgnoreCase("YES"))
			{
				Student obj = new Student(stuid, stuname, stuaddress);
				System.out.println(obj.getStuId());
				System.out.println(obj.getStuName());
				System.out.println(obj.getStuAddress());
				System.out.println(obj.getCollegeName());
				break;
				
			}
			else if(condition.equalsIgnoreCase("no") || condition.equalsIgnoreCase("No"))
			{
				System.out.println("CollegeName");
				String collegename= sc.nextLine();
				Student obj = new Student(stuid, stuname, stuaddress,collegename);
				System.out.println(obj.getStuId());
				System.out.println(obj.getStuName());
				System.out.println(obj.getStuAddress());
				System.out.println(obj.getCollegeName());
				break;
				
				
				
			}
			else
			{
				System.out.println("invalid");
			}
		}
	}
	

}
