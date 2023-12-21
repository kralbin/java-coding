interface ShowDetail{
	void showDetail(String name, int age);
}
class InterfaceEg implements ShowDetail{
	public void showDetail(String name, int age){
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
	} 
	public static void main(String[] args){
		InterfaceEg obj = new InterfaceEg();
		obj.showDetail("Albin", 26);
	}
}