package NumberOne;
import java.util.Scanner;
public class SecondExercise {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of multiples: ");
		int numOfMultiple = in.nextInt();
		
		boolean useTab = false;
		
		for(int i = 1; i <= numOfMultiple; i++) {
			if(useTab) {
				System.out.println("\t" + (i * 7)); //print with a tab
			}
			else {
				System.out.println(i*7); //print without a tab
			}
			useTab = !useTab; //alternate between no tab and one tab
		}
		
	}

}
