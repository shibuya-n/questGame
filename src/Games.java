public class Games {
    String name;
    int points;
    int level = 1;

    int mathStage = 1;

    boolean win = false;

    public Games(String x){
        name = x;
    }


    public void scramble(){
        System.out.println("Welcome to the scramble quest, challenger " + name);

        String scrambleString = "";
        String solutions = "";

        int ascii = (int)(Math.random() * 11) + 97;

        for (int i = 0; i < 6; i++) {

            ascii += i;
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

        System.out.println("");
        System.out.println("What is your answer?");
        System.out.println(solutions);

        if (Quest.getInput().equals(solutions)) {
            points++;
            System.out.println("You gained a point! Current points: " + points );

        }
        else {
            System.out.println("Wrong! Restarting...");
            System.out.println("");
            scramble();
        }




    }

    public static int randomInt(){
        return (int) (Math.random() * 10) + 1;
    }

    public void math() {

        if (this.level <= 2) {
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
                    math();
                } else {
                    math();
                }
            } else if (mathStage == 2) {
                System.out.println("Stage 2: Subtraction");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " - " + y + "? ");

                if (subtraction(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    math();
                } else {
                    math();
                }

            } else if (mathStage == 3) {
                System.out.println("Stage 3: Multiplication");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " * " + y + "? ");

                if (multiplication(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    math();
                } else {
                    math();
                }
            }
            else {
                System.out.println("Stage 4: Multiplication");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " / " + y + "? ");

                if (division(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    math();
                } else {
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
    } public static boolean division(int randOne, int randTwo, int input){
        int answer = randOne / randTwo;
        return input == answer;
    }
    public void trivia(){
        if (this.level <=2) {
            System.out.println("You aren't strong enough for this level yet. :(");

        }else {
            System.out.println("Welcome to trivia quest, challenger " + name);
            //add challenge (binary convert?)
        }
    }public void challenge(){
        if (this.level <=3) {
            System.out.println("You aren't strong enough for this level yet. :(");

        }else {
            //add challenge (binary convert?)
        }
    }
}
