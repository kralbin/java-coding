class TestStaticMethod{
	static int data = 30;
	static class Inner{
		static void msg(){
			System.out.println("Data is ="+data);
		}
	}
}
public class StaticClassMethod {
	public static void main(String[] args){
		TestStaticMethod.Inner.msg();
	}
}
