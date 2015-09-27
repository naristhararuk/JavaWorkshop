/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author INT675
 */
public class Deal {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        int numHands =5;
        int cardsPerHand = 7;
          List<Card> deck = Deck.getDeck();
        //System.out.println(deck);
      
        
        Collections.shuffle(deck);
        //System.out.println(deck);
        
        if(numHands * cardsPerHand > deck.size()){
            System.out.println("Not Enought Cards");
            return;
        }
        System.out.println("------------------------------");
        for (int i = 0; i < numHands; i++) {
            System.out.println("Hand ("+(i+1) + ")");
            System.out.println(dealHand(deck,cardsPerHand));
            System.out.println("------------------------------");
            System.out.println(ANSI_RED +"this text is red"+ANSI_RESET);
        }
    }

    private static List<Card> dealHand(List<Card> deck, int n) {
        int deckSize = deck.size();
        List<Card> handView = deck.subList((deckSize-n),deckSize);
        List<Card> hand = new ArrayList<Card>(handView);
        handView.clear();
        return hand;
    }
}
