package polimorfizm_practice;

public class AnimalShow5 {
public static void main(String[] args) {
	Animal myAnimal=new Dog();
//	myAnimal.makeNoise();
//	myAnimal= new Cat();
//	myAnimal.makeNoise();
	Animal myAnimal2=new Horse();
	System.out.println(myAnimal.legCount);
	System.out.println(myAnimal2.legCount);
	
	Horse h1=(Horse)myAnimal2;
	System.out.println(h1.legCount);
	System.out.println(h1.color);
	
	Horse h2= (Horse)myAnimal2;
	
	
	//===================================
	//this is creating object
	//without storing the address of the object
	//and jsut using it once --like calling method as below
	//this object is not accessible after this line
	//because we did not write down the address
	//new Dog().makeNoise();
	
	
	
	
	
	
	
}
}
