package pkgCore;

import java.util.ArrayList;

import pkgEnum.*;

public class Deck {
	private ArrayList<Card> deckOfCards = new ArrayList<Card>();

	public Deck(int iNbrOfDecks) {

		for (int i = 0; i < iNbrOfDecks; i++) {
			for (eSuit eSuit : eSuit.values()) {
				for (eRank eRank : eRank.values()) {
					deckOfCards.add(new Card(eRank, eSuit));
				}
			}
		}

	}

	
	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}

	public ArrayList<Card> getdeckOfCards() {
		return deckOfCards;
	}

	public Card draw() {
		return deckOfCards.remove(0);
	}
}
