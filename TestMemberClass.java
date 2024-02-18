class Outer{
	public void display(){
		Inner in = new Inner();
		in.show();
	}
	class Inner{
		public void show(){
			System.out.println("Inside Inner");
		}
	}
}
public class TestMemberClass {
	public static void main(String[] args){
		Outer ot = new Outer();
		ot.display();
	}
}
