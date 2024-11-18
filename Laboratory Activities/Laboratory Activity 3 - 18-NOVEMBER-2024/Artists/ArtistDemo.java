package LaboratoryActivtity3;

public class ArtistDemo {

	public static void main(String[] args) {
		Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
		artist.displayInfo();
		System.out.println();
		
		Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
		singer.displayInfo();
		System.out.println();
		
		Dancer dancer = new Dancer("Shakira", "Colombian", 47, "Dance", DanceStyle.HIPHOP);
		dancer.displayInfo();
		System.out.println();
		
		Painter painter = new Painter("Michelangelo", "Italian", 88, "Painting", Medium.ACRYLIC);
		painter.displayInfo();
		System.out.println();
		
		Writer writer = new Writer("Jose Rizal", "Filipino", 35, "Writing", WritingStyle.DRAMA);
		writer.displayInfo();
		System.out.println();
				
	}

}
