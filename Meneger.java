package polimorfizm_practice;

public class Meneger implements Title{

	public static void printStatic() {
		System.out.println("Static Meneger");
	}
	
	
	@Override
	public void printTitle() {
		System.out.println("I am Meneger");
		
	}
	
	public void printDefault() {
		System.out.println("Meneger default");
	}
}
