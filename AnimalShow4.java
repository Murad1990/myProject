package polimorfizm_practice;

public class AnimalShow4 {

	
	public static void main(String[] args) {
		//Cat is Cat
		Cat c1=new Cat();
		//Copying the address stored inside c1
		//into c2 variable, and its pointing to same object
		Cat c2= c1;
		
		Animal a1=c1;
		//a1 is paper that can hold any kind of animal object address
		a1=new Dog();
		IndoorPet i1=c1;
	
		
		
		
		
}

}