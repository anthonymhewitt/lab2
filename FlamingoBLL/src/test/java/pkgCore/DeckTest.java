package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		Deck d1 = new Deck(1);
		assertEquals(52,d1.getdeckOfCards().size());
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck
		
	}

	public void Test6Deck()
	{
		Deck d1 = new Deck(6);
		assertEquals(52 * 6,d1.getdeckOfCards().size());
	}
}
