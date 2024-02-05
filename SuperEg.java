class Display{
	Display(){
		System.out.println("Super class Constructor called");
	}
}
public class SuperEg extends Display{
	SuperEg(){
		super();  //super keyword will call super class constructor.
		System.out.println("Current class Constructor called");
	}
	public static void main(String[] args){
		SuperEg obj = new SuperEg();
	}
}