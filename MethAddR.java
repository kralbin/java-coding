import java.util.Scanner;
class MethAddR{
	public static int add(int noF, int noS){
		return (noF+noS);
	}
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		noF = sc.nextInt();
		System.out.println("Enter the 2nd Number:");
		noS = sc.nextInt();
		System.out.println("Sum:"+(add(noF, noS)));
	}
}	