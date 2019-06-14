package polimorfizm_practice;

public class Cube extends Shape{

	
	
	public Cube(String color, int countOfSide, int lengthOfOneSide) {
		super(color, countOfSide, lengthOfOneSide);
		
	}

	@Override
	public void countLength() {
		System.out.println("Length of side of Cube is "+ lengthOfOneSide*countOfSide);
		
	}

	@Override
	public String toString() {
		return "Cube [color=" + color + ", countOfSide=" + countOfSide + ", lengthOfOneSide=" + lengthOfOneSide + "]";
	}

	
	
}
