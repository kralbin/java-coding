import java.util.Scanner;
abstract class MyTest{
	public abstract void calculate(int a, int b);
}
class Addition extends MyTest{
	public void calculate(int a, int b){
		System.out.println(a+b);
	}		
	
}
class Subtraction extends MyTest{
	public void calculate(int a, int b){
		System.out.println(a-b);
		
	}
}
class Multiplication extends MyTest{
	public void calculate(int a, int b){
		System.out.println(a*b);
		
	}
}
class Demos{
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		noF = sc.nextInt();
		System.out.println("Enter 2nd number:");
		noS = sc.nextInt();
		Addition a = new Addition();
		Subtraction s = new Subtraction();
		Multiplication m = new Multiplication();
		a.calculate(noF, noS);
		s.calculate(noF, noS);
		m.calculate(2,3);
	}
}
	