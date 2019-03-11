/**
 * SYST 17796 Project Winter 2019 Code
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class to be used as the Out of the program handling
 * presents the user with questions and input is handled by another class
 * @author Bryan Pacher, 2019
 *
 */

class Out {

    Out(){
    }

    public void askName() {
        System.out.println("Hi! What is your name?");
    }

    public void greeting(String name) {
        System.out.println("Hello, "+name+", let's play some Blackjack!");
    }

    public void askCash() {
        System.out.println("How much cash do you want to start with?");
    }

    public void showCash(int cash) {
        System.out.println("Cash: "+cash);
    }

    public void cannotBet() {
        System.out.println("You cannot bet more money than you have!");
    }

    public void askBet() {
        System.out.println("How much do you wish to bet?");
    }

    public void showBet(int bet) {
        System.out.println("Money on the table: " + bet);
    }

    public void showHand(BPlayer bplayer) {
        System.out.println("Here is your hand: ");
        System.out.println(bplayer.gHand(1));
    }

    public void showDealerFirstCard(Dealer dealer) {
        System.out.println("The dealer is showing:");
        Hand hand = dealer.gHand(1);
        System.out.println(hand.getCard(1));
    }

    public void showDealerHand(Dealer dealer) {
        System.out.println("Here is the dealer's hand:");
        System.out.println(dealer.gHand(1));
    }

    public void yesOrNo() {
        System.out.println("Please answer yes or no.");
    }


    public void dealerBlackJack() {
        System.out.println("The dealer has Blackjack!");
    }

    public void userBlackJack() {
        System.out.println("You have BlackJack!");
        System.out.println("You win 2x your money back!");
    }

    public void win() {
        System.out.println("Congratulations, you win!");
    }

    public void lose() {
        System.out.println("Sorry, you lose!");
    }

    public void push() {
        System.out.println("It's a push!");
        System.out.println("You get your money back.");
    }

    public void hitOrStand() {
        System.out.println("Would you like to hit or stand?");
    }

    public void playAgain() {
        System.out.println("Would you like to play again?");
    }

    public void cashTotal(int cash) {
        System.out.println("Your cash total is: "+cash);
        System.out.println("Enjoy your winnings!");
    }

    public void cashTotalZero(int cash) {
        System.out.println("Your total cash is: "+cash);
        System.out.println("You ran out of cash!");
    }

    public void busted() {
        System.out.println("You busted!");
    }

    public void dealerBusted() {
        System.out.println("The dealer busted!");
    }
}

