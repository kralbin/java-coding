class Tata{
	public void enquiry(){
		System.out.println("Enquiry for a car");
	}
}

//Polymorphsim
class Tiago extends Tata{
	//@override
	public void enquiry(){
		System.out.println("Tiago Enquiry");
	}
	public int quote(int onRoadPrice, int discount){
		return onRoadPrice-discount; 
	}
	//overload
	public double quote(double onRoadPrice, double discount){
		return onRoadPrice-discount;
	}
	
}
//Encapsulation
class Owner{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
}

//Abstraction
abstract class TestDrive{
	public abstract void run();
		void preBooked(){
			System.out.println("Booked for test drive");		}
}

//Inheritance
class TestA extends TestDrive{
	public void run(){
		System.out.println("\nCar is Running");
	}
}
//Interface Abstraction
interface VehicleInsurance{
	int numberOfYears = 15;  //Static field
	public abstract void insurance();
	
}
interface VehiclePollution{
	public abstract void PollutionCertificate();
}

class RCBook implements VehicleInsurance, VehiclePollution{
	public void insurance(){
		System.out.println("Insurance paid for"+numberOfYears+"years");
	}
	public void PollutionCertificate(){
		System.out.println("Pollution Test Conducted");
	}
}
public class Car{
	public static void main(String[] args){
		Tata tata = new Tata();
		tata.enquiry();
		
		Tiago tiago = new Tiago();
		tiago.enquiry();
		
		System.out.println("Tiago variant XZ quote amt="+tiago.quote(600000, 4500));
		System.out.println("Tiago varient XZ+ quote amt="+tiago.quote(720000.00, 48000.00));
		
	//polymorphism
		Owner owner = new Owner();
		owner.setName("Albin");
		System.out.println("Name:"+owner.getName());
		
		TestA test = new TestA();
		test.preBooked();
		test.run();
		
		
		RCBook rcbook =new RCBook();
		rcbook.insurance();
		rcbook.PollutionCertificate();
		
	}
}
