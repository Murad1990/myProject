package polimorfizm_practice;

public class Cat extends Animal implements IndoorPet{

	public void makeNoise() {
		System.out.println("miau miau");
	}
	
	
	public static void main(String[] args) {
		Animal a1=new Dog();
		Dog d1= (Dog)a1;
		d1.makeNoise();
		
	}
	
}
