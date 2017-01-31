/*
 *  NU Educational License - 2017
 */
package edu.nu.ch7.cards;

/**
 * Represents a playing card. It has a face value and it belongs to a suit.
 * 
 * @author Ogun otigli@gmail.com
 */
public class Card {
    private final String face;
    private final String suit;

    /**
     * Constructor for the playing card.
     * 
     * @param face (like "Ace", "Deuce", etc.)
     * @param suit (like "Hearts", "Clubs", etc.)
     */
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }    

    /**
     * Overriding the defaults toString in order to represent 
     * the playing card in a textual form.
     * 
     * @return textual representation of the card
     */
    @Override
    public String toString() {      
        return this.face + " of " + this.suit;
    }
}
