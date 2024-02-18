class OuterC{
	class InnerB{
		public void show(){
			System.out.println("Inside Inner");
		}
	}
}
public class TestMemberClassB {
	public static void main(String[] args){
		OuterC ot = new OuterC();
		OuterC.InnerB in = ot.new InnerB();
		in.show();
	}
}
