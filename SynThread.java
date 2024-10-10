class Table{
	synchronized void printTable(int n){
		for(int i=1; i<=5; i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class TestThread1 extends Thread{
	Table t;
	TestThread1(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}
class TestThread2 extends Thread{
	Table t;
	TestThread2(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(100);
	}
}
public class SynThread {
	public static void main(String[] args){
		Table obj = new Table();
		TestThread1 testObj = new TestThread1(obj);
		TestThread2 testObj2 = new TestThread2(obj);
		
		testObj.start();
		testObj2.start();
	}

}
