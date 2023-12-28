package inheritance;

import java.util.Scanner;

public class Main {
	public static Hosteller getHostellerDetails()
	{
		Hosteller hosteller= new Hosteller();
		Scanner sc= new Scanner(System.in);
		System.out.println("hostelname");
		String a=sc.nextLine();
		System.out.println("roomnum");
		int b=sc.nextInt();
		System.out.println("id1");
		int c=sc.nextInt();
		System.out.println("name");
		sc.nextLine();
		String d=sc.nextLine();
		System.out.println("deptid");
		int e=sc.nextInt();
		System.out.println("gender");
		sc.nextLine();
		String f=sc.nextLine();
		System.out.println("phoneno");
		String g=sc.nextLine();
		hosteller.setHostelName(a);
	    hosteller.setStudentId(c);
		hosteller.setName(d);
		hosteller.setDepartmentId(e);
		hosteller.setGender(f);
		System.out.println("modify roomno or not(Y/N)");
		int z=sc.next().charAt(0);
		if(z=='Y' || z=='y')
		{
			System.out.println("modify roomno ");
			int h=sc.nextInt();
			hosteller.setRoomNumber(h);
		}
		else
		{
			hosteller.setRoomNumber(b);
		}
		System.out.println("modify phonenumber or not(Y/N)");
		int t=sc.next().charAt(0);
		if(t=='Y' || t=='y')
		{
			System.out.println("modify phonenumber");
			sc.nextLine();
			String ht=sc.nextLine();
			hosteller.setPhone(ht);
		}
		else
		{
			hosteller.setPhone(g);
		}
		return hosteller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hosteller hosteller2=new Hosteller();
		hosteller2=getHostellerDetails();
		System.out.println(hosteller2.getStudentId()+"| "+hosteller2.getRoomNumber()+"| "+hosteller2.getHostelName()+" |"+hosteller2.getPhone()+" |"+hosteller2.getGender()+" |"+hosteller2.getName()+"| "+hosteller2.getDepartmentId()+ "| " );
		
		

	}

}
