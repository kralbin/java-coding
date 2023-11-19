import java.util.Scanner;
class ArrayIO{
	public static void main(String[] args){
		int size, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		size = sc.nextInt();
		int[] ar = new int[size];
		for(i=0;i<size;i++){
			System.out.println("Enter the Array Elements:");
			ar[i] = sc.nextInt();
		}
		System.out.println("The Array Elements are:");
		for(i=0;i<size;i++){
			System.out.println(ar[i]);
		}
		System.out.println("The Length of the Array is:"+ar.length);
	}
}
		
