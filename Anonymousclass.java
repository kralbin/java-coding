interface Animal{
	void type();   //by default public
}
public class Anonymousclass {
	public static void main(String[] args){
		
		Animal an = new Animal(){
			public void type(){
				System.out.println("Anonymous animal");
			}
		};    //imp
		an.type();
	}
}
