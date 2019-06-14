package polimorfizm_practice;

public interface Animal_methodHiding {
public static void main(String[] args) {
	
//	Animal.doStatic();
//	Dog.doStatic();
//	Horse.doStatic();
	
	Animal a1=new Dog();
	a1.doStatic();

	Animal a2=new Horse();
	a2.doStatic();
	
	
}
}
