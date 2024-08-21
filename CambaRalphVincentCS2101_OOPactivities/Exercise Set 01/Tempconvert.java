package NumberOne;
import java.util.Scanner;
public class Tempconvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Celsius value: ");
		double tempCelsius = in.nextDouble();
		
		double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
		
		System.out.printf("%.2f Celsius is %.2f Fahrenheit", tempCelsius, tempFahrenheit);

	}

}
