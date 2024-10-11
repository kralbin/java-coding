
public class TestThread extends Thread{
	public void run(){
		System.out.println("Run the Thread");
	}
	public static void main(String[] args){
		TestThread t = new TestThread();
		t.start();
	}
	
}
