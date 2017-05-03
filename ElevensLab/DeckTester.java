/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"A", "B", "C"};
		String[] suits1 = {"Giraffes", "Lions"};
		int[] pointValues1 = {2, 1, 6};
		Deck d1 = new Deck(ranks1, suits1, pointValues1);
		
		String[] ranks2 = {"jack", "queen", "king"};
		String[] suits2 = {"blue", "red"};
		int[] pointValues2 = {11, 12, 13};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		
		String[] ranks3 = {"A", "B", "C"};
		String[] suits3 = {"Giraffes", "Lions"};
		int[] pointValues3 = {2, 1, 6};
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
	}
}
