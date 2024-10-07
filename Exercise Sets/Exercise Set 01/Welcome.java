package NumberOne;
import java.util.Scanner;

public class NumberOne {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to CS 211: Object Oriented Programming!");
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("This course will be fun, " + name);

	}

}
