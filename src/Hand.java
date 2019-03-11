/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class that handles player & dealer hand.
 * @author Bryan pacher, 2019
 */


import java.util.ArrayList;


class Hand {
    private ArrayList<Card> hand;
    private int handValue;
    private int aceC;

    Hand(Deck deck) {
        hand = new ArrayList<>();
        aceC = 0;
        handValue = 0;
        for (int i = 0; i < 2; i++) {
            hand.add(deck.drawCard());
        }
        Card[] aHand = new Card[]{};
        aHand = hand.toArray(aHand);
        for (int i = 0; i < aHand.length; i++) {
            handValue += aHand[i].getValue();
            if (aHand[i].getValue() == 11) {
                aceC++;
            }
            while (aceC > 0 && handValue > 21) {
                handValue -= 10;
                aceC--;
            }
        }
    }

    public void Hit(Deck deck) {
        hand.add(deck.drawCard());
        Card[] aHand = new Card[]{};
        aHand = hand.toArray(aHand);
        handValue = 0;
        aceC=0;
        for (int i = 0; i < aHand.length; i++) {
            handValue += aHand[i].getValue();
            if (aHand[i].getValue() == 11) {
                aceC++;
            }
            while (aceC > 0 && handValue > 21) {
                handValue -= 10;
                aceC--;
            }
        }
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
        return handValue;
    }

    public Card getCard(int cardnum) {
        Card[] aHand = new Card[]{};
        aHand = hand.toArray(aHand);
        return aHand[cardnum-1];
    }

    public String toString(){
        String hands ="";
        Card[] aHand = new Card[]{};
        aHand = hand.toArray(aHand);
        for(int i=0; i<aHand.length-1; i++) {
            hands = hands + aHand[i].toString() + ", ";
        }
        hands = hands + aHand[aHand.length-1].toString();
        return hands;
    }
}