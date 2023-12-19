class Number{
	int noF =2;
	int noS =5;
}
class Add extends Number{
	public void add(){
		System.out.println("Addition:"+(noF+noS));
	}
}
class Multiply extends Number{
	public void multiply(){
		System.out.println("Multipilication"+(noF*noS));
	}	
}
class Arithematic{
	public static void main(String[] args){
		Add obj1 = new Add();
		Multiply obj2 = new Multiply();
	
		obj1.add();
		obj2.multiply();
	}
}