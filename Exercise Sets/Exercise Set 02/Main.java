package encapsulationTwo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String color;
		double price;
		char size;
		System.out.print("Enter car color: ");
		color = in.nextLine();
		
		System.out.print("Enter car price: ");
		price = in.nextDouble();
		
		System.out.print("Enter car size: ");
		size = in.next().charAt(0);
		
		Car car = new Car(color, price, size);
		car.toString(color, price, size);
		
		in.close();
	}

}
