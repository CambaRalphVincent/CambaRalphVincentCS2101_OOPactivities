package LaboratoryActivity4;

public class ShapeCollection {
	private Shape[] shapes;
	
	public ShapeCollection(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	public void getPropertyValues() {
		for(Shape shape: shapes) {
			shape.printShapeType();
			System.out.printf("Area: %.2f", shape.getArea());
			System.out.printf("\nPerimeter: %.2f", shape.getPerimeter());
			System.out.println("\n");
		}
		
	}
}
