package activity_4;

import java.util.List;

import activity_2.Card;

import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++) {
				cards.add(new Card(ranks[j], suits[i], values[j]));
			}
		}
		size = cards.size();
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
	    for (int i = this.cards.size() - 1; i > 0; i--)
	    {
	      int j = i + 1;
	      int k = 0;
	      int m = (int)(Math.random() * j) + k;
	      Card localCard = (Card)this.cards.get(i);
	      this.cards.set(i, this.cards.get(m));
	      this.cards.set(m, localCard);
	    }
	    this.size = this.cards.size();
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
	    if (isEmpty()) {
	        return null;
	      }
	      this.size -= 1;
	      Card card = (Card)this.cards.get(this.size);
	      return card;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
	    String str = "size = " + this.size + "\nUndealt cards: \n";
	    for (int i = this.size - 1; i >= 0; i--)
	    {
	      str = str + this.cards.get(i);
	      if (i != 0) {
	        str = str + ", ";
	      }
	      if ((this.size - i) % 2 == 0) {
	        str = str + "\n";
	      }
	    }
	    str = str + "\nDealt cards: \n";
	    for (int i = this.cards.size() - 1; i >= this.size; i--)
	    {
	      str = str + this.cards.get(i);
	      if (i != this.size) {
	        str = str + ", ";
	      }
	      if ((i - this.cards.size()) % 2 == 0) {
	        str = str + "\n";
	      }
	    }
	    str = str + "\n";
	    return str;
	}
}
