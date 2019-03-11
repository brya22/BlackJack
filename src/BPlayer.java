/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * Extends player class
 * @author Bryan pacher, 2019
 */


class BPlayer extends Player {
    private int cash;
    private int bet;
    private String name;

    BPlayer() {
    }

    public int getCash() {
        return cash;
    }

    public int getBet() {
        return bet;
    }

    public String getName() {
        return name;
    }

    public void setCash(int money) {
        cash = money;
    }

    public void setBet(int money) {
        bet = money;
    }

    public void setName(String username) {
        name = username;
    }

    public void split(Deck deck) {
        Hand hand2 = new Hand(deck);
        hand.add(hand2);
    }

    public void doubleDown() {
        cash=cash-bet;
        bet=2*bet;
    }

    public void win() {
        cash=cash+2*bet;
    }
    public void push() {
        cash=cash+bet;
    }
    public void blackJack() {
        cash=cash+3*bet;
    }

}