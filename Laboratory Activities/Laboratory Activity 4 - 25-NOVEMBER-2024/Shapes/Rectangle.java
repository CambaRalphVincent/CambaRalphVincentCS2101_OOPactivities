package LaboratoryActivity4;

public class Rectangle implements Shape {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		double area = length * width;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	@Override
	public void printShapeType() {
		System.out.println("Rectangle");
	}

}
