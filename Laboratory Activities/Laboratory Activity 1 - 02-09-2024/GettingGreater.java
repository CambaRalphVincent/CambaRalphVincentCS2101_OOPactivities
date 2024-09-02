package OOPactivities;

import java.util.Scanner;

public class GettingGreater {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Getting the Greater Value");
		
		System.out.print("Enter first character: ");
		char firstChar = in.next().charAt(0);
		System.out.print("Enter second character: ");
		char secondChar = in.next().charAt(0);
		
		int greaterValue = Math.max(firstChar, secondChar);
		char anotherGreaterValue = (char) greaterValue;
		
		System.out.println("------------------------------------------");
		System.out.println("The character with greater value is: " + anotherGreaterValue);
		System.out.println("------------------------------------------");
		
		System.out.println("Showing the ASCII Codes");
		int FirstAsciiValue = (int) firstChar;
		int SecondAsciiValue = (int) secondChar;
		System.out.println(firstChar + ": " + FirstAsciiValue);
		System.out.println(secondChar + ": " + SecondAsciiValue);
		
		in.close();
		
		
		

	}

}
