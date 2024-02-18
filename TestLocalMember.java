class OuterA{
	int countA;
	public void display(){
		for(int i=0; i<5; i++){
			class inner{
				public void show(){
					System.out.println("Inside Inner"+(countA++));
				}
			}
				inner in = new inner();
				in.show();
		}
	}
}
public class TestLocalMember {
	public static void main(String[] args){
		OuterA ot = new OuterA();
		ot.display();
	}
}

