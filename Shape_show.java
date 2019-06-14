package polimorfizm_practice;

public class Shape_show {
public static void main(String[] args) {
	
	
	
	       Triangle t2= new Triangle ("Red", 3, 2);
	         t2.countLength();
	       System.out.println(t2);
	       System.out.println("=================================");
	         
	         
	          Shape t1=new Triangle("White", 3, 8);
	          t1.countLength();
	          System.out.println(t1);
	          System.out.println("======================================");
	          Shape c1=new Cube("Blue", 12, 4);
	          c1.countLength();
	          System.out.println(c1);
	          
}
}
