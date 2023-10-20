import java.util.*;

public class Quest {

    public static void main(String[] args) {
        System.out.println("What is your name, traveler?");
        Games obj = new Games(getInput());


        ask(obj);
    }

    public static void ask(Games y){





        // add animation?
        // dynamic selection?

        while (!y.win) {
            // dev mode
            if (y.name.equals("a")){
                y.level = 666;
            }

            String input;
            if (y.level == 1) {
                System.out.println("Welcome to League of Letters, " + y.name);
                System.out.println("Your points: " + y.points);
                System.out.println();
                System.out.println("Which challenge would you like to attempt?");
                System.out.println("1. Scramble");
                System.out.println("2. Math [LOCKED]");
                System.out.println("3. Trivia [LOCKED] ");
                System.out.println("FINAL BOSS (unlocked after level 3)");
                input = getInput();
            }
            else if (y.level == 2) {
                System.out.println("Welcome to League of Letters, " + y.name);
                System.out.println("Your points: " + y.points);
                System.out.println();
                System.out.println("Which challenge would you like to attempt?");
                System.out.println("1. Scramble");
                System.out.println("2. Math [UNLOCKED]");
                System.out.println("3. Trivia [LOCKED] ");
                System.out.println("???(unlocked after level 3)");
                input = getInput();
            }

            else if (y.level == 3){
                    System.out.println("Welcome to League of Letters, " + y.name);
                    System.out.println("Your points: " + y.points);
                    System.out.println();
                    System.out.println("Which challenge would you like to attempt?");
                    System.out.println("1. Scramble");
                    System.out.println("2. Math [UNLOCKED]");
                    System.out.println("3. Trivia [UNLOCKED] ");
                    System.out.println("??? (unlocked after level 3)");
                    input = getInput();
            }
            else {
                System.out.println("Welcome to League of Letters, " + y.name);
                System.out.println("Your points: " + y.points);
                System.out.println();
                System.out.println("Which challenge would you like to attempt?");
                System.out.println("1. Scramble");
                System.out.println("2. Math [UNLOCKED]");
                System.out.println("3. Trivia [UNLOCKED] ");
                System.out.println("4. THE FINAL BOSS AWAITS YOU.");
                input = getInput();
            }
            System.out.println();

            if (input.equals("1")) {
                System.out.println("Scrambling letters...");
                sleep(500);
                System.out.println("You walk into the crowded arena full of not so friendly letters...");
                sleep(500);
                System.out.println("They attack!");
                y.scramble();

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

    public static void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getInput(){
        Scanner obj = new Scanner(System.in);
        return obj.nextLine().strip().toLowerCase();
    }
}