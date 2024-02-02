class Test1{
	static final int num;
	
	static{     //static varible intialized in static block
		num = 100;
		System.out.println("Num="+num);
	}
}
public class StaticBlankFinalEg{  //Static block runs when the class is loaded.
	public static void main(String[] args){
		Test1 obj1 = new Test1();   //no value is passed
	}
}