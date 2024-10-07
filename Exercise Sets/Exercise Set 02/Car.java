package encapsulationTwo;

public class Car {

	private String color;
	private double price;
	private char size;
	
	Car(String color, double price, char size) {
		this.color = color;
		this.price = price;
		this.size = Character.toUpperCase(size);
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public char getSize() {
		return size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSize(char size) {
		this.size = size;
	}
	
	public void toString(String color, double price, char size) {
		if (size == 's' || size == 'S') {
			String newSize = "small";
			System.out.println("For a " + color + " car priced at " + String.format("%.2f", price) + " and of " + newSize + " size: " + "Car " + "(" + color + ")" + " - " + "P" + String.format("%.2f", price) + " - " + size);
		}
		else if(size == 'm' || size == 'M') {
			String newSize = "medium";
			System.out.println("For a " + color + " car priced at " + String.format("%.2f", price) + " and of " + newSize + " size: " + "Car " + "(" + color + ")" + " - " + "P" + String.format("%.2f", price) + " - " + size);
		}
		else if(size == 'l' || size == 'L') {
			String newSize = "large";
			System.out.println("For a " + color + " car priced at " + String.format("%.2f", price) + " and of " + newSize + " size: " + "Car " + "(" + color + ")" + " - " + "P" + String.format("%.2f", price) + " - " + size);
		}
		
	}

}
