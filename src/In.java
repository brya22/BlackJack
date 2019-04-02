/**
 * SYST 17796 Project Winter 2019 Code
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class to be used as the In of the program handling
 * understands the question for the user and input is handled here
 * @author Bryan Pacher, 2019
 *
 */
import java.util.Scanner;

class In {
    private Out outputter;
    In(Out outputs) {
        outputs = outputter;
    }

    public String getName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    public int getCash() {
        Scanner money = new Scanner(System.in);
        int cash = money.nextInt();
        return cash;
    }

    public int getBet(int cash) {
        Scanner sc = new Scanner(System.in);
        int bet = sc.nextInt();
        while (bet > cash) {
            outputter.cannotBet();
            outputter.askBet();
            bet=sc.nextInt();
        }
        return bet;
    }

    public boolean Yes() {
        Scanner doubledown = new Scanner(System.in);
        String doubled = doubledown.nextLine();
        while (!YesorNo(doubled)) {
            outputter.yesOrNo();
            doubled = doubledown.nextLine();
        }
        return doubled.equals("yes");
    }

    public boolean YesorNo(String answer) {
        return (answer.equals("yes") || answer.equals("no"));
    }

    public boolean Hit() {
        Scanner hitter = new Scanner(System.in);
        String hit = hitter.nextLine();
        while(!Hitorstand(hit)) {
            outputter.yesOrNo();
            hit = hitter.nextLine();
        }
        return hit.equals("hit");
    }

    public boolean Hitorstand(String hit) {
        return (hit.equals("hit") || hit.equals("stand"));
    }

}