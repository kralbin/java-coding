import java.util.Scanner;
class Employee{
	int rollNo;
	String empName;

	public void setDetails(int r, String n){
		rollNo = r;
		empName = n;
	}
	public void getDetails(){
		System.out.println("Employee Details");
		System.out.println("Employee Roll No:"+rollNo+"Employee Name:"+empName);
	}
}
		
public class EmpInput{
	public static void main(String[] args){
		int roll;
		String name;
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no:");
		roll = sc.nextInt();
		System.out.println("Enter the Name of the Employee");
		name = sc.next();
		emp.setDetails(roll, name);
		emp.getDetails();

	}		
}	