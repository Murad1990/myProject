package polimorfizm_practice;

public class TitleShow2 {

	
	Title t1=new Employee();
	Title t2= new Meneger();
	Title t3=new Director();
	Employee e1=(Employee)t1;
	
	
	public Title giveMeShape1() {
		return t1;
	}
	
	public Title giveMeShape2() {
		return t2;
	}
	
	public Title giveMeShape3() {
		return t3;
	}
	
	public Title giveMeShape4() {
		return e1;
	}
	
	public static void main(String[] args) {
		TitleShow2 a1=new TitleShow2();
		Title b1=a1.giveMeShape1();
		b1.printTitle();
		Employee.printStatic();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
