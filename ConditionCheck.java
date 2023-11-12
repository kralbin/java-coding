import java.util.Scanner;
class ConditionCheck{
	public static void main(String[] args){
		int noF, noS, noT;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		noF = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		noS = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		noT = sc.nextInt();
		if((noF>noS) && (noF>noT)){
			System.out.println(noF+ "is Greatest");
		}
		else if((noS>noF) && (noS>noT)){
			System.out.println(noS+ "is Greatest");
		}
		else{
			System.out.println(noT+ "is Greatest");
		}
	}
}

