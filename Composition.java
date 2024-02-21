class Engine{
	public void work(){
		System.out.println("Engine Started");
	}
}
final class CarA{
	private final Engine engine; //will make the value of Engine class as constant
	//private Engine engine; //Aggregation
	CarA(Engine engine){
		this.engine = engine;
	}
	public void move(){
		engine.work();
		System.out.println("Car is moving");
	}
		
}
public class Composition {
	public static void main(String[] args){
		Engine engine = new Engine();
		 
		CarA car = new CarA(engine);
		car.move();
		
		
		
	}

}
