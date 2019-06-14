package polimorfizm_practice;

public class Employee implements Title{

	
	public static void printStatic() {
		System.out.println("Static Employee");
	}

	@Override
	public void printTitle() {
		System.out.println("I am Employee");
		
	}
	
	public void printDefault() {
		System.out.println("Employee Default");
	}
	
}
