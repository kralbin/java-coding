import java.util.Scanner;
class Facto{
	public static void factor(int fa){
		int fact =1;	
		for(int i = 1;i<=fa;i++){
			fact = fact*i;
		}
		System.out.println("The Factorial is:"+fact);
	}
	public static void main(String[] args){
		int fa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range:");
		fa = sc.nextInt();
		factor(fa);
	}
}	 