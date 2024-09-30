package LaboratoryActivtity2;
import java.util.Scanner;
public class MultiplicationTable {

	static void assignValues(int[][] twoDArray, int tableSize) {
		for(int i = 0; i < twoDArray.length; i++) {
			for(int j = 0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = (i + 1) * (j + 1); 
			}
		}
	}
	
	static void displayTable(int[][] twoDArray) {
		for(int i = 0; i < twoDArray.length; i++) {
			for(int j = 0; j < twoDArray[i].length; j++) {
				System.out.printf("%4d", twoDArray[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tableSize;
		
		System.out.print("Enter the size of the multiplication table: ");
		tableSize = in.nextInt();
		
		int[][] twoDArray = new int[tableSize][tableSize];

		System.out.println("Multiplication Table: ");
		assignValues(twoDArray, tableSize);
		displayTable(twoDArray);
		
		in.close();

	}

}
