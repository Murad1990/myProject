package polimorfizm_practice;

public class Dog extends Animal implements IndoorPet{
String legCount="Dog leg";

public static void doStatic() {
	System.out.println("Dog Static");
}

	public void makeNoise() {
		System.out.println("woof woof");
	}
	
	
}
