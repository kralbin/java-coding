class Engineering extends Thread{
	public void run(){
		System.out.println("Engineering");
	}
}
class Software extends Thread{
	public void run(){
		System.out.println("Software");
	}
	
}
public class TestThreadOne {
	public static void main(String[] args){
		Engineering e = new Engineering();
		Software s = new Software();
		e.start();
		s.start();
		
		s.setPriority(10);
		e.setPriority(Thread.MIN_PRIORITY);
	}
}
