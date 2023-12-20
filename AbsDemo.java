import java.util.Scanner;
abstract class Abst{
	public abstract void numbers();
}
class Add extends Abst{
	public void numbers(){
		int a =  4;
		int b = 6;	
		System.out.println("Addtion"+(a+b));
	}
}
class Multiply extends Abst{
	public void numbers(){
		int a = 6;
		int b = 7;
		System.out.println("Multiply:"+(a*b));
	}
}
class AbsDemo{
	public static void main(String[] args){
		Add obj2 = new Add();
		obj2.numbers();

		Multiply obj3 = new Multiply();
		obj3.numbers();
	}
}
		
		
		