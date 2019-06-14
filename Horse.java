package polimorfizm_practice;

public class Horse extends Animal{
     String color="Black";
	String legCount="Horse leg";
	
	public static void doStatic() {
		System.out.println("Horse Static");
	}
	
	public void makeNoise() {
		System.out.println("neigh neigh");
	}
	
}
