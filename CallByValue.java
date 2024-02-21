public class CallByValue {
	int change(int b){
		++b;
		return b;
	}
	public static void main(String[] args){
		CallByValue obj = new CallByValue();
		int a = 20;
		int x = obj.change(a);
		
		
		System.out.println("Value of a after passing: "+a);
		System.out.println("Value of x after modiyfing: "+x);
	}
}