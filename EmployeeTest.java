package employee;
import java.util.Scanner;
class Employee{
	int empId;
	String empName;
	
}
class PermanentEmployee extends Employee{
	String designation;
	String department;
	float salary;
	
	PermanentEmployee(int empId, String empName, String designation, String department){
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.salary = 1000.0f;
	}
	
	public void printDetails(){
		System.out.println("Permanent Employee Details");
		System.out.println("Employee ID:" +empId);
		System.out.println("Employe Name:" +empName);
		System.out.println("Designation:" +designation);
		System.out.println("Department:" +department);
		System.out.println("Salary:" +salary);
		
	}
}
class PartTimeEmployee extends Employee{
	int workingDays;
	
	PartTimeEmployee(int empId, String empName, int workingDays){
		this.empId = empId;
		this.empName = empName;
		this.workingDays = workingDays;
	}
	
	public void printSalary(){
		float salary = workingDays*500;
		System.out.println("Part Time Employee Details");
		System.out.println("Employee ID:" +empId);
		System.out.println("Employe Name:" +empName);
		System.out.println("Salary:"+salary);
	}
}
public class EmployeeTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int empId;
		String empName; 
		String designation; 
		String department;
		int workingDays;

		System.out.println("Enter the Employee ID:");
		empId = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		empName = sc.next();
		System.out.println("Enter the Employee Designation:");
		designation = sc.next();
		System.out.println("Enter the Employee Department:");
		department = sc.next();
		
		PermanentEmployee pe = new PermanentEmployee(empId, empName, designation, department );
		pe.printDetails();
		
		System.out.println("Enter the Employee ID:");
		empId = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		empName = sc.next();
		System.out.println("Enter the Working Days:");
		workingDays = sc.nextInt();
		
		PartTimeEmployee pte = new PartTimeEmployee(empId, empName, workingDays);
		pte.printSalary();
		
		sc.close();
		
		
		
	}
}
