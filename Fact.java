import java.util.Scanner;
class Fact{
	public static void main(String[] args){
		int range, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range:");
		range =sc.nextInt();
		for(int i =1;i<=range;i++){
			fact= fact*i;
		}
		System.out.println("The Factorial of the Given Range:"+fact);
	}
}