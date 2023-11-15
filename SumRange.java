import java.util.Scanner;
class SumRange{
	public static void main(String[] args){
		int noF, range, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		noF = sc.nextInt();
		System.out.println("Enter the Range:");
		range = sc.nextInt();
		do{
			sum = sum + noF;
			noF++;
		}while(noF<range);
		System.out.println("Sum of the Range:"+sum);
	}
}