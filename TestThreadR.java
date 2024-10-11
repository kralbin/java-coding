
public class TestThreadR implements Runnable{
	public void run(){
		System.out.println("Running Thread");
	}
	public static void main(String[] args){
		TestThreadR tr = new TestThreadR();
		Thread t = new Thread(tr);
		t.start();
	}

}
