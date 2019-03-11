/**
 * SYST 17796 Project Winter 2019 Code
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class to be used as the Card class
 *
 * @author Bryan Pacher, 2019
 *
 */




class Card {
    private final int face;
    private final int suit;
    private static String[] faces = { "Joker", "Ace", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
            "King" };
    private static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

    Card(int suit, int values) {
        this.face = values;
        this.suit = suit;
    }

    public String toString() {
        return faces[face] + " of " + suits[suit];
    }

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        int value=0;
        if (face > 10) {
            value = 10;
        } else if (face == 1) {
            value = 11;
        } else {
            value = face;
        }
        return value;
    }
}