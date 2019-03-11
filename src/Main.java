/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * Main Program that runs it all.
 * @author Bryan pacher, 2019
 */


public class Main {


    public static void main(String[] args) {
        Out out = new Out();
        In input = new In(out);
        out.askName();
        out.greeting(input.getName());
        out.askCash();
        BPlayer bplayer = new BPlayer();
        Dealer dealer = new Dealer();
        bplayer.setCash(input.getCash());
        while (bplayer.getCash() > 0) {
            Deck deck = new Deck();
            deck.shuffle();
            bplayer.getNewHand(deck);
            dealer.getNewHand(deck);
            out.showCash(bplayer.getCash());
            out.askBet();
            bplayer.setBet(input.getBet(bplayer.getCash()));
            bplayer.setCash(bplayer.getCash() - bplayer.getBet());
            out.showCash(bplayer.getCash());
            out.showBet(bplayer.getBet());
            out.showHand(bplayer);
            out.showDealerFirstCard(dealer);
            if (bplayer.hasBJ(1) && dealer.hasBJ(1)) {
                out.userBlackJack();
                out.dealerBlackJack();
                out.push();
                bplayer.push();
            } else if (bplayer.hasBJ(1)) {
                bplayer.blackJack();
                out.userBlackJack();
                out.win();
            } else if (dealer.hasBJ(1)) {
                out.dealerBlackJack();
                out.lose();
            } else {
                out.hitOrStand();
                while (input.Hit()) {
                    bplayer.gHand(1).Hit(deck);
                    out.showHand(bplayer);
                    out.hitOrStand();
                    if (bplayer.Busted()) {
                        out.busted();
                        out.lose();
                        break;
                    }
                }
                if(!bplayer.Busted()) {
                    dealer.tTurn(deck);
                    out.showDealerHand(dealer);
                    if (dealer.Busted()) {
                        out.dealerBusted();
                        out.win();
                        bplayer.win();
                    } else {
                        if ((21 - bplayer.Busted(1).getHandValue()) < (21 - dealer
                                .Busted(1).getHandValue())) {
                            out.win();
                            bplayer.win();
                        }
                        if ((21 - bplayer.Busted(1).getHandValue()) == (21 - dealer
                                .Busted(1).getHandValue())) {
                            out.push();
                            bplayer.push();
                        }
                        if ((21 - bplayer.Busted(1).getHandValue()) > (21 - dealer
                                .Busted(1).getHandValue())) {
                            out.lose();
                        }
                    }
                }
            }
            out.showCash(bplayer.getCash());
            out.playAgain();

        }
        if (bplayer.getCash() == 0) {
            out.cashTotalZero(bplayer.getCash());
        }
        out.cashTotal(bplayer.getCash());
    }

