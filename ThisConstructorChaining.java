class Construct{
	int a,b;
	Construct(){
		this(10,20);
		System.out.println("Default constructor called");
	}
	Construct(int num1){
		this(num1, 0);
		System.out.println("One parameter constructor called");
	}
	Construct(int num1, int num2){
		a = num1;
		b = num2;
		System.out.println("Two parameter constructor called");
	}
	public void display(){
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
}

class ThisConstructorChaining{
	public static void main(String[] args){
		Construct obj1 = new Construct();
		obj1.display();
	
		Construct obj2 = new Construct(30);
		obj2.display();

		Construct obj3 = new Construct(50,60);
		obj3.display();
	}

}		