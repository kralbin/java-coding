class DisplayInstance{
	int num = 100;
	}
class Show extends DisplayInstance{
	int num = 200;   //overwrites

	public void show(){
		System.out.println("n="+super.num); //super keyword
			
	}
}
public class SuperInstanceVariable{
	public static void main(String[] args){
		Show obj = new Show();
		obj.show();
	}
}

//output = 100-> superclass instance variable gets invoked