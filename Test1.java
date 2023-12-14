import java.util.Scanner;
class Stud{
	int rollNo;
	String name;

	Stud(int rollNo, String na){
	this.rollNo = rollNo;
	name = na;
	}
}
class Test1{
	public static void main(String[] args){
		int rollNo;
		String na;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rollno:");
		rollNo = sc.nextInt();
		System.out.println("Enter Name:");
		na = sc.next();
		Stud s1 = new Stud(rollNo, na);
	}
}