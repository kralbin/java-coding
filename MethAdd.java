import java.util.Scanner;
class MethAdd{
	public static void sum(int noF, int noS){
		System.out.println("Sum =" +(noF+noS));
	}
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		noF = sc.nextInt();
		System.out.println("Enter the 2nd Number:");
		noS = sc.nextInt();
		sum(noF, noS);
	}
}	