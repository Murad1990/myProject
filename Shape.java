package polimorfizm_practice;

public abstract class Shape {

	String color;
	int countOfSide;
	int lengthOfOneSide;
	
	public abstract void countLength();

	public Shape(String color, int countOfSide, int lengthOfOneSide) {
		super();
		this.color = color;
		this.countOfSide = countOfSide;
		this.lengthOfOneSide = lengthOfOneSide;
	}
	
	
}
