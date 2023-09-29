import java.util.*;

public class Quest {

    public static void main(String[] args) {
        ask(getInput());
    }

    public static void ask(String x){
        System.out.println("What is your name, traveler?");
        Games obj = new Games(getInput());
        String input = x;

        System.out.println("Welcome to League of Letters, " + obj.name);
        System.out.println("Which game would you like to play?");
        System.out.println("1. Scramble");
        System.out.println("2. Math");
        System.out.println("3. Trivia");
        System.out.println("FINAL BOSS (unlocked after level 3)");

        // add animation?
        // dynamic selection?

        while (true){
            if (input.equals("1")){
                obj.scramble();
            }
            else if (input.equals("2")){
                obj.math();
            }
            else if (input.equals("3")){
                obj.trivia();
            }
            else if (input.equals("4")){
                obj.challenge();
            }
            else {
                ask(getInput());
            }
            if (obj.win){
                break;
            }
        }

    }
    public static String getInput(){
        Scanner obj = new Scanner(System.in);
        return obj.nextLine().strip().toLowerCase();
    }
}