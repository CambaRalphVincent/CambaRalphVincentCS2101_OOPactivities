package LaboratoryActivity4;

public class Square implements Shape {
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		double area = side * side;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = side * 4;
		return perimeter;
	}
	
	@Override
	public void printShapeType() {
		System.out.println("Square");
	}

}
