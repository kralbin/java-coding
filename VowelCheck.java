import java.util.Scanner;
class VowelCheck{
	public static void main(String[] args){
		char vowel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vowel alphabet:");
		vowel = sc.next().charAt(0);
		switch(vowel){
			case 'a':
				System.out.println("Letter entered is vowel");
				break;
			case 'e':
				System.out.println("Letter entered is vowel");
				break;
			case 'i':
				System.out.println("Letter entered is vowel");
				break;
			case 'o':
				System.out.println("Letter entered is vowel");
				break;
			case 'u':
				System.out.println("Letter entered is vowel");
				break;
			
			default:
				System.out.println("Enter Vowel Letter");
		}	
	}
}

			
			