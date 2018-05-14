package activity_2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suitTypes = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] rankTypes = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		int[] pointValueTypes = {2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 1};
		
		String[] tRanks = new String[52];
		int[] tPointValues = new int[52];
		
		for(int i = 0; i < 4; i++) {
			for(int g = 0; g < 13; g++) {
				tRanks[g + (i * 13)] = rankTypes[g];
				tPointValues[g + (i * 13)] = pointValueTypes[g];
			}
		}
		
		Deck d2 = new Deck(tRanks, suitTypes, tPointValues);
		System.out.println("1.");
		System.out.println(d2.toString());
		System.out.println();
		
		d2.shuffle();
		System.out.println("2.");
		System.out.println(d2.toString());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
