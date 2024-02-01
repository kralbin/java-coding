class Enclosing{
	private static int x = 1;
	public static class StaticNested{
		public void run(){
			System.out.println("Value of x ="+x);
		}
	}
}

public class TestStatic {

	public static void main(String[] args) {
	Enclosing.StaticNested ns = new Enclosing.StaticNested();
	ns.run();

	}

}
