import java.util.Scanner;	
class EvenRange{
	public static void main(String[] args){
		int noF, Range;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Intial Number:");
		noF = sc.nextInt();
		System.out.println("Enter the Last Number:");
		Range = sc.nextInt();
		System.out.println("Even number btw the entered numbers are:");
		while(noF<Range){
			if(noF%2 == 0){
				System.out.println(noF);
			}
			noF++;
		}	
	}
}