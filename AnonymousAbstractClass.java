abstract class Person{
	abstract void eat();
}
public class AnonymousAbstractClass {
	public static void main(String[] args){
		Person P = new Person(){
			void eat(){
				System.out.println("Fruits");
			}
		};
		P.eat();
	}
}
