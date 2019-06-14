package polimorfizm_practice;

public class AnimalShow {

	public static void main(String[] args) {
		
		
		Animal d1=new Dog();
		Animal d2=new Cat();
		Animal d3= new Horse();
		
		Animal[]animal= new Animal [3];
		animal[0]=d1;
		animal[1]=d2;
		animal[2]=d3;
		
		for(Animal each : animal) {
			each.makeNoise();
		}
		
	}
	
	
}
