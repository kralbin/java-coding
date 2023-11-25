import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		int i, size, temp;
		System.out.println("Enter the Array Size:");
		size=sc.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter the array elements:");
		for(i=0;i<size;i++){
			ar[i]=sc.nextInt();
		}
		System.out.println("The Array entered is:");
		for(i=0;i<size;i++){
			System.out.println(ar[i]);
		}
		for(i=0;i<size;i++){
			for(int j =1;j<(size-1);j++){
				if (ar[j-1] > ar[j]){	
					temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(i =0; i<size;i++){
			System.out.println(ar[i]);
		}
	}
}

	