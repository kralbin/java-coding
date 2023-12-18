import java.util.Scanner;
class Student{
	int rollNo;
	String name;
}
class Course extends Student{
	String cou = "DDMCA";
}

class Class extends Course{
	String cla = "DD15";
	public void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RollNo:");
		rollNo = sc.nextInt();
		System.out.println("Enter the name:");
		name = sc.next();
	}
	public void display(){
		System.out.println("Roll no:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Course:"+cou);
		System.out.println("Class:"+cla);
	}
}
class InheriClass{
	public static void main(String[] args){
		Class obj1 = new Class();
		obj1.getDetails();
		obj1.display();
	}
}