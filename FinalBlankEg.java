class Test{
	final int num; //not initialized
	
	Test(int n){  //intiallized using Constr. at the time obj creation.
		num = n;
		System.out.println("Num="+num);
	}
}
public class FinalBlankEg{
	public static void main(String[] args){
		Test obj = new Test(100);//Intialized at the time of Obj Creation.
	}
}
//no change is possible for "num" hereafter.