import java.util.Scanner;
class Emp{
	int eid;
	String ename;

	Emp(){}

	Emp(int ide, String n){
	eid = ide;
	ename = n;
	}

	Emp(String n, int ide){
	ename = n;
	eid = ide;
	}

	public void setDetails(int id, String name){
	eid = id;
	ename = name;	
	}

	public void getDetails(){
	System.out.println("Employee Details");
	System.out.println("Employee ID:"+eid+"Employee Name:"+ename);
	}
	public static void main(String[] args){
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		name = sc.next();
		Emp employee = new Emp();

		employee.setDetails(id, name);
		employee.getDetails();
		
		Emp employee1 = new Emp(1,"ashlin");
		
		Emp employee2 = new Emp("ashlin", 1);
	}
}
		