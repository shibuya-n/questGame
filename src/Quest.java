import java.util.*;

public class Quest {

    public static void main(String[] args) {
        System.out.println("What is your name, traveler?");
        Games obj = new Games(getInput());


        ask(obj);
    }

    public static void ask(Games y){

        System.out.println("Welcome to League of Letters, " + y.name);
        System.out.println("Which game would you like to play?");
        System.out.println("1. Scramble");
        System.out.println("2. Math");
        System.out.println("3. Trivia");
        System.out.println("FINAL BOSS (unlocked after level 3)");

        String input = getInput();

        // add animation?
        // dynamic selection?

        while (!y.win) {

            if (input.equals("1")) {
                y.scramble();
                break;

            } else if (input.equals("2")) {
                y.math();

            } else if (input.equals("3")) {
                y.trivia();
            } else if (input.equals("4")) {
                y.challenge();
            } else {
                ask(y);
            }

        }

    }
    public static String getInput(){
        Scanner obj = new Scanner(System.in);
        return obj.nextLine().strip().toLowerCase();
    }
}