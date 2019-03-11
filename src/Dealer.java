/**
 * SYST 17796 Project Winter 2019 Code
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class to be used as the Dealer of cards
 * @author Bryan Pacher, 2019
 *
 */

public class Dealer extends Player {
    Dealer() {
    }


    public boolean wHit() {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return aHand[0].getHandValue()<17;
    }

    public void showHand() {
        System.out.println(hand);
    }

    public void tTurn(Deck deck) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        while (wHit()) {
            System.out.println("The dealer hits.");
            aHand[0].Hit(deck);
            if (Busted()) {
                break;
            }
        }
        System.out.println("The dealer stands.");
    }
}
