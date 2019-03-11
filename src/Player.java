/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique (name).
 * @author Bryan pacher, 2019
 */

//unneeded abstract classes, to many files will cause confusion and is very extra.

import java.util.ArrayList;

class Player {
    ArrayList<Hand> hand;

    Player() {
        hand = new ArrayList<Hand>();
    }

    public boolean hasBJ(int handnum) {
        Hand[] aHand = new Hand[] {};
        aHand = hand.toArray(aHand);
        return (aHand[handnum-1].getHandSize() == 2 && aHand[handnum-1].getHandValue() == 21);
    }

    public boolean Busted() {
        Hand[] aHand = new Hand[] {};
        aHand = hand.toArray(aHand);
        return (aHand[0].getHandValue() > 21);
    }

    public Hand gHand(int handnum) {
        Hand[] aHand = new Hand[] {};
        aHand = hand.toArray(aHand);
        return aHand[handnum-1];
    }

    public void getNewHand(Deck deck) {
        hand.clear();
        Hand myHand = new Hand(deck);
        hand.add(myHand);
    }
}

