class Customer{
	int balance = 10000;
	synchronized void withdraw(int amt){
		if(this.balance <amt){
			System.out.println("No Sufficient Balance");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.balance = balance-amt;
	}
	synchronized void deposit(int amt){
		this.balance = balance+amt;
		System.out.println("Deposit completed");
		notify();
	}
}
public class ThreadCoop {
	public static void main(String[] args){
		final Customer c = new Customer();
		new Thread(){
			public void run(){
				c.withdraw(15000);
			}
		}.start();
		new Thread(){
			public void run(){
				c.deposit(10000);
			}
		}.start();
		
	}
}
