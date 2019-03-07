
import java.util.*;

public class Main {

    private static String name;//name of the user
    private static int cash;//cash the user bets with
    private static int bet;//how much the user wants to bet

    public static void main(String[] args) {
        System.out.println("Hi! What is your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Hello, "+name+", lets play some BlackJack!");
        System.out.println("How much cash do you want to start with?");
        Scanner money = new Scanner(System.in);
        cash = money.nextInt();
        System.out.println("You start with cash: "+cash);
    }
}
