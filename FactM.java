import java.util.Scanner;
class FactM{
	public static int facto(int r){
		int fact = 1;
		for(int i =1; i<=r; i++){
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
		int range;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		range = sc.nextInt();
		System.out.println(facto(range));
	}
}