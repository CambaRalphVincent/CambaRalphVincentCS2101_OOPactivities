package OOPactivities;
import java.util.Scanner;
public class GettingInputs {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String album, genre, title, artist;
		int year;
		
		System.out.print("Enter the year: ");
		year = in.nextInt();
		in.nextLine();
		System.out.print("Enter the genre: ");
		genre = in.nextLine();
		
		System.out.print("Enter the album: ");
		album = in.nextLine();
		
		System.out.print("Enter the song title: ");
		title = in.nextLine();
		
		System.out.print("Enter the artist: ");
		artist = in.nextLine();
		
		System.out.println("-------------------------");
		System.out.println("SONG DETAILS");
		System.out.println("-------------------------");
		
		System.out.println("Year Released: " + year);
		System.out.println("Genre: " + genre);
		System.out.println("Album: " + album);
		System.out.println("Title: " + "\"" + title + "\"");
		System.out.println("Artist: " + artist);
		
		in.close();
		
	}

}
