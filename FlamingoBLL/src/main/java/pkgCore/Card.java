package pkgCore;

import pkgEnum.*;

public class Card implements Comparable {
	
	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	public eRank eRank;
	public eSuit eSuit;
	
	public eRank geteRank() {
		return eRank;
	}

	public Card(pkgEnum.eRank eRank, pkgEnum.eSuit eSuit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}

	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return this.geteRank().compareTo(c.geteRank());

}

}
