/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class that handles the deck, shuffing/displaying/drawing.
 * @author Bryan pacher, 2019
 */


import java.util.ArrayList;
import java.util.Random;

class Deck {
    private ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        Card temp;
        for (int i = 0; i < 200; i++) {
            int index1 = random.nextInt(deck.size() - 1);
            int index2 = random.nextInt(deck.size() - 1);
            temp = deck.get(index2);
            deck.set(index2, deck.get(index1));
            deck.set(index1, temp);
        }
    }

    public Card drawCard() {
        return deck.remove(0);
    }
}