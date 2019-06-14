package polimorfizm_practice;

public class Triangle extends Shape{

	public Triangle(String color, int countOfSide,	int lengthOfOneSide) {
		super(color,countOfSide,lengthOfOneSide);
	  
	}
	
	
	@Override
	public void countLength() {
		System.out.println("Length of side of Triangles is "+lengthOfOneSide*countOfSide);
		
	}


	@Override
	public String toString() {
		return "Triangle [color=" + color + ", countOfSide=" + countOfSide + ", lengthOfOneSide=" + lengthOfOneSide
				+ "]";
	}

	
	
}
