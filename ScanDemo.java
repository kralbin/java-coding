import java.util.Scanner;
class ScanDemo{
	public static void main(String[] args){
		int noF,noS;
		
		char ch;
		Scanner sc = new Scanner(System.in);
		String wrd;
		System.out.println("Enter a number:");
		noF = sc.nextInt();
		System.out.println("Enter 2nd number:");
		noS = sc.nextInt();
		System.out.println("Enter a Character:");
		ch = sc.next().charAt(0);
		System.out.println("Enter a word:");
		wrd = sc.next();
		if(noF < noS){
			System.out.println("noF is Greater");
		}
		else{
			System.out.println("noS is Greater");
		}
		System.out.println("The Word entered:"+wrd);
		System.out.println("The 1st letter of entered character is:"+ch);
	}	
}