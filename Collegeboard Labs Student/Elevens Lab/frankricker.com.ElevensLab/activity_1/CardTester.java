/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("K", "Spades", 10);
		Card c2 = new Card("3", "Clubs", 3);
		Card c3 = new Card("K", "Spades", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println();
		
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
		System.out.println(c2.matches(c3));
	}
}
