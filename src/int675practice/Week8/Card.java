/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

/**
 *
 * @author INT675
 */
public class Card {
    private int rank;
    private int suit;
    private static String[] suits = { "hearts", "diamonds", "spades", "clubs" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
	Card(int suit, int rank)
	{
		this.rank=rank;
		this.suit=suit;
	}

	public @Override String toString()
	{
                  if(suit < 2){
                    return ANSI_BLUE+ranks[rank]+ANSI_RESET + " of " + ANSI_RED+suits[suit] +ANSI_RESET;
                  }
                  else{
                    return  ANSI_BLUE+ranks[rank]+ANSI_RESET + " of " + suits[suit];
                  }
	}

	public int getRank() {
		 return rank;
	}

	public int getSuit() {
		return suit;
	}

}
