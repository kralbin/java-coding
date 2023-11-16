import java.util.Scanner;
class NumberSum{
	public static void main(String[] args){
		int noF, range, evenSum =0, oddSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		noF = sc.nextInt();
		System.out.println("Enter the Range:");
		range = sc.nextInt();
		for(;noF<=range; noF++){
			if(noF%2 == 0){
				evenSum = evenSum+noF;
			}
			else{
				oddSum = oddSum+noF;
			}
		}
		System.out.println("The Sum of Even Numbers:"+evenSum);
		System.out.println("The Sume of Odd Numbers:"+oddSum);
	}
}