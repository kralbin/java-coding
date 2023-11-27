import java.util.Scanner;
class Swap{
	public static void swapping(int f, int s){
		f = f+s;
		s = f-s;
		f = f-s;
		System.out.println("After Swapping");
		System.out.println("First No:"+f);
		System.out.println("Second No:"+s);
	}
	public static void main(String[] args){
		int noF, noS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		noF = sc.nextInt();
		System.out.println("Enter Second Number:");
		noS = sc.nextInt();
		swapping(noF, noS);
	}
}
	