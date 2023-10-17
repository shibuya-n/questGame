
public class Games {
    String name;
    int points;
    int level = 1;

    int mathStage = 1;

    int triviaStage = 1;

    boolean win = false;

    boolean completedScramble = false;
    boolean completedMath = false;
    boolean completedTrivia = false;

    public Games(String x){
        name = x;
    }


    public void checkPlayer() {
        if (this.points >= 3 && completedScramble) {
            this.level++;
            System.out.println();
            System.out.println("Congrats! You leveled up! The next stage is unlocked.");
            System.out.println();
        }
        if (this.points >= 6 && completedMath) {
            this.level++;
            System.out.println();
            System.out.println("Congrats! You leveled up! The next stage is unlocked.");
            System.out.println();
        }
        if (this.points >= 9 && completedTrivia) {
            this.level++;
            System.out.println();
            System.out.println("Congrats! You leveled up! The FINAL BOSS is unlocked.");
            System.out.println();
        }
    }
    public void scramble(){
        System.out.println("Welcome to the scramble quest, challenger " + name);

        String scrambleString = "";
        String solutions = "";

        int ascii = (int)(Math.random() * 11) + 97;

        for (int i = 0; i < 6; i++) {

            ascii += (int)(Math.random() * 3) + 1;

            solutions = solutions + (char)ascii;

        }

        String temp = "";
        temp += solutions;

        for (int i = 0; i < solutions.length(); i++){
            int random = (int)(Math.random() * temp.length()-1) + 1;

            if (temp.length() == 1) {
                scrambleString += temp;
                break;
            }
            else {
                scrambleString += temp.charAt(random);

                temp = temp.substring(0, random) + temp.substring(random + 1);
            }

        }


        System.out.println("Unscramble this string: ");
        System.out.println(scrambleString);

        System.out.println();
        System.out.println("What is your answer?");
        System.out.println(solutions);

        if (Quest.getInput().equals(solutions)) {
            this.points++;
            System.out.println();
            System.out.println("You gained a point! Current points: " + this.points );
            System.out.println();
            completedScramble = true;
            checkPlayer();

        }
        else {
            System.out.println("Wrong! Restarting...");
            System.out.println();
            scramble();
        }




    }

    public static int randomInt(){
        return (int) (Math.random() * 10) + 1;
    }

    public void math() {


        if (this.level < 2) {
            System.out.println("You aren't strong enough for this level yet. :(");

        } else {
            System.out.println("Welcome to the math quest, challenger " + name);

            if (mathStage == 1) {
                System.out.println("Stage 1: Addition");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " + " + y + "? ");

                if (addition(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Right Answer! Plus 1 point.");
                    checkPlayer();
                    math();
                } else {
                    System.out.println("Wrong answer! Restarting...");
                    math();
                }
            } else if (mathStage == 2) {
                System.out.println("Stage 2: Subtraction");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " - " + y + "? ");

                if (subtraction(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Right Answer! Plus 1 point.");
                    checkPlayer();
                    math();
                } else {
                    System.out.println("Wrong answer! Restarting...");
                    math();
                }

            } else if (mathStage == 3) {
                System.out.println("Stage 3: Multiplication");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " * " + y + "? ");

                if (multiplication(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Right Answer! Plus 1 point.");
                    checkPlayer();
                    math();
                } else {
                    System.out.println("Wrong answer! Restarting...");
                    math();
                }
            }
            else {
                System.out.println("Stage 4: Division");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " / " + y + "? Round to the 2nd decimal place. ");

                if (division(x, y, Double.parseDouble(Quest.getInput()))) {
                    points += 1;
                    System.out.println("Right Answer! Plus 1 point.");

                    completedMath = true;
                    System.out.println("Good job! Challenge complete! Points: " + this.points);
                    mathStage = 1;

                    checkPlayer();
                } else {
                    System.out.println("Wrong answer! Restarting...");
                    math();
                }
            }
        }
    }
    public static boolean addition (int randOne, int randTwo, int input){
            int answer = randOne + randTwo;

        return input == answer;
        }
    public static boolean subtraction(int randOne, int randTwo, int input){
            int answer = randOne - randTwo;
        return input == answer;
    }

    public static boolean multiplication(int randOne, int randTwo, int input){
        int answer = randOne * randTwo;
        return input == answer;
    }
    public static boolean division(int randOne, int randTwo, double input) {

        double answer = (double) randOne / randTwo;


        return input == Math.round(answer * 100.0) / 100.0;
    }

    public void trivia(){
        if (this.level < 3) {
            System.out.println("You aren't strong enough for this level yet. :(");

        }else {
            System.out.println("Welcome to trivia quest, challenger " + name);
            System.out.println("STAGE ONE");
            if (triviaStage == 2 || stageOne()) {
                triviaStage++;
                System.out.println("STAGE TWO");
                if (triviaStage == 3 || stageTwo()){
                    triviaStage++;
                    System.out.println("FINAL STAGE");
                    if (stageThree()){
                        points += 2;
                    }
                    else {
                        trivia();
                    }

                }
                else {
                    trivia();
                }

            }
            else {
                trivia();
            }


        }

        }
    public static boolean stageOne(){
        int stagePoints = 0;
        for (int i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + i + " of 3");
            Trivia x = new Trivia(random);

            stagePoints += x.question();
        }
        if (stagePoints >= 3){
            return true;
        }
        else {
            System.out.println("You didn't get them all right :3 Try again!");
            return false;
        }
    }
    public static boolean stageTwo(){
        int stagePoints = 0;
        for (int i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + i + " of 4");
            Trivia x = new Trivia(random);

            stagePoints += x.question();
        }
        if (stagePoints >= 4){
            return true;
        }
        else {
            System.out.println("You didn't get them all right :3 Try again!");
            return false;
        }
    }
    public static boolean stageThree(){
        int stagePoints = 0;
        for (int i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + i + " of 5");
            Trivia x = new Trivia(random);

            stagePoints += x.question();
        }
        if (stagePoints >= 5){
            return true;
        }
        else {
            System.out.println("You didn't get them all right :3 Try again!");
            return false;
        }
    }
    public void challenge(){
        if (this.level <=3) {
            System.out.println("You aren't strong enough for this level yet. :(");
            this.win = true;
        }else {
            //add challenge (binary convert?)
        }
    }
}
