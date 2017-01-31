/*
 *  NU Educational License - 2017
 */
package edu.nu.ch7.cards;

import java.security.SecureRandom;

/**
 * This class represents a deck of playing cards.
 * 
 * @author Ogun otigli@gmail.com
 */
public class Deck {
    private Card[] cards;
    private int currentCardIndex;
    private static final int NUM_OF_CARDS = 52; // constant # of cards
    private static final SecureRandom random = new SecureRandom();    
    boolean shuffled = false;
    
    /**
     * Constructs the deck of cards by creating cards in order and
     * assigns the new card to the correct position at the array.
     */
    public Deck() {
        String[] faces = {"Ace", "Deuce", "Tree", "Four", "Five",  
                          "Six", "Seven", "Eight", "Nine", "Ten", 
                          "Jack", "Queen", "King" };
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        cards = new Card[NUM_OF_CARDS];
        currentCardIndex = 0;
        
        // Populate the dect with cards
        for (int count=0; count < NUM_OF_CARDS; count++) {
            cards[count] = new Card(faces[count%13], suits[count/13]);
        }
    }
    
    /**
     * Shuffles the cards.
     */
    public void shuffle() {
        currentCardIndex = 0;
        shuffled = true;
        
        for (int first=0;first < cards.length;first++) {
            int second = random.nextInt(NUM_OF_CARDS);
            
            Card temp = cards[first];
            cards[first] = cards[second];
            cards[second] = temp;
        }
    }
    
    /**
     * Gets whether the deck is shuffled or not.
     * @return true if shuffled or false otherwise
     */
    public boolean isShuffled() {
        return shuffled;
    }
    
    /**
     * Deals a card if available in the deck, if not it returns null.
     * @return dealt card
     */
    public Card dealCard() {
        // If we have remaning cards then return it
        if (currentCardIndex < cards.length) {
            return cards[currentCardIndex++];
        }
        else
            return null;
    }
}
