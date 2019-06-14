package polimorfizm_practice;

public class TitleShow {
	public static void main(String[] args) {
		Title t1=new Employee();
		Title t2= new Meneger();
		Title t3=new Director();
		printTitle(t1);//can be t2 , t3 ...all same
		Employee e1=(Employee)t1;
		printTitle(e1);
		printTitle(new Dog());	
		Employee.printStatic();
		System.out.println(e1.num);
		t1.printDefault();
		e1.printDefault();
		Meneger m1=new Meneger();
		m1.printStatic();
	}
	public static void printTitle(Object anyObject) {
		System.out.println("Object title");
	}
	
	public static void printTitle(Meneger anyMeneger) {
		System.out.println("Meneger title");
	}
	
	public static void printTitle(Employee anyEmployee) {
		System.out.println("Employee title");
	}
		
	public static void printTitle(Title anyTitle) {
		System.out.println("Any Title");
	}
	
	//These are static because i do not want to create obj to call them. main goal is overloadig
}
