package LaboratoryActivtity2;
import java.util.Scanner;

public class GetArrayMean {
	
	static double getArrayMean(double[] arrayNumbers, int arrayLength) {
		double sum = 0, meanValue;
		for(int i = 0; i < arrayLength; i++) {
			sum += arrayNumbers[i];
		}
		meanValue = sum/arrayLength;
		return meanValue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrayLength;
		double mean;
		
		System.out.print("Enter number of elements: ");
		arrayLength = in.nextInt();
		
		double[] arrayNumbers = new double[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Enter number: ");
			arrayNumbers[i] = in.nextDouble();
		}
		
		mean = getArrayMean(arrayNumbers, arrayLength);
		System.out.println("Mean of array is: " + String.format("%.2f", mean));
		
		in.close();

	}

}
