import java.util.Scanner;
class Student{
	int rollNo;
	String name;
}
class Course extends Student{
	String department = "MCA";
	public void getDetails(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student Roll no:");
	rollNo = sc.nextInt();
	System.out.println("Enter the Student Name:");
	name = sc.next();
	}
	public void showDetails(){
		System.out.println("Course name:" +department);
		System.out.println("Student Roll No:" +rollNo);
		System.out.println("Student Name =" +name);
	}
}
class College{
	public static void main(String[] args){
		Course obj1 = new Course();
		obj1.getDetails();
		obj1.showDetails();
	}
}