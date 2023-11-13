import java.util.Scanner;
class Range{
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		noF = sc.nextInt();
		System.out.println("Enter 2nd number:");
		noS = sc.nextInt();
		System.out.println("The given range is:");
		while(noF<=noS){
			System.out.println(noF);
			noF++;
		}
	}
}
				