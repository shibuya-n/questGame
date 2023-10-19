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
                System.out.println("Preparing numbers for battle...");
                sleep(500);
                System.out.println("You approach a shady group of merchants at a bar...");
                sleep(500);
                System.out.println("They start throwing numbers at you with deadly aim! Quick, use your math skills to nullify their attacks!");
                System.out.println(y.name + ", MOVE!");
                y.math();

            } else if (input.equals("3")) {
                System.out.println("Organizing trivia questions...");
                sleep(500);
                System.out.println("You approach an elderly man with a long, white beard...");
                sleep(500);
                System.out.println("He offers you a strange sword, won only if you get all his trivia questions right!");
                System.out.println("You sit down across from him...");
                sleep(500);

                y.trivia();
            } else if (input.equals("4")) {
                System.out.println("There seems to be inscriptions on the sword...");
                System.out.println("Would you like to look closer?");
                if (getInput().equals("yes")){
                    System.out.println("You look closer.");
                    sleep(500);
                    System.out.println("You suddenly feel an overwhelming headache and you close your eyes");
                    sleep(500);
                    System.out.println("You feel a hot, steamy breath on your forehead.");
                    sleep(500);
                    System.out.println("IT'S A BINARY DRAGON! DO THE RIGHT CONVERSIONS TO DEFEAT IT!");
                    sleep(500);;
                    y.challenge();
                }
                else {
                    System.out.println("Coward.");
                    System.out.println();
                }

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