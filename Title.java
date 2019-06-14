package polimorfizm_practice;

public interface Title {

	public static final int num=9;
	
	public static void printStatic() {
		System.out.println("Static title");
	}
	
	public default void printDefault() {
		System.out.println("Title Default");
	}
	
	public  void printTitle();
	
}
