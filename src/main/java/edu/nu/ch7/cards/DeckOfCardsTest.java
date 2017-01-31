/*
 *  NU Educational License - 2017
 */
package edu.nu.ch7.cards;

/**
 * Just a simple test driver for the deck of cards.
 * 
 * @author Ogun otigli@gmail.com
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        Deck cards = new Deck();
        
        cards.shuffle();
        
        for (int i=1;i <= 52;i++) {
            //System.out.print(cards.dealCard() + " ");
            //System.out.printf("%19s", cards.dealCard());
            System.out.printf("%-19s", cards.dealCard());
            
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
