package polimorfizm_practice;

public class Director implements Title{

	public static void printStatic() {
		System.out.println("Static Director");
	}
	
	
	@Override
	public void printTitle() {
		System.out.println("I am Director");
		
	}
	
	public void printDefault() {
		System.out.println("Director default");
	}
}
