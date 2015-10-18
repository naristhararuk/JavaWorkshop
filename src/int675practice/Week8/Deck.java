/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author INT675
 */
public class Deck {
    
    public static List<Card> getDeck(){
        List<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card c = new Card(i,j);
                deck.add(c);
            }
        }
        return deck;
    }
}
