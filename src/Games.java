public class Games {
    String name;
    int points;
    int level = 2;

    int mathStage = 1;

    boolean win = false;

    public Games(String x){
        name = x;
    }


    public void scramble(){
        System.out.println("Welcome to the scramble quest, challenger " + name);

        String scrambleString = "";
        String solutions = "";

        for (int i = 0; i < 6; i++) {

            int ascii = (int)(Math.random() * 26) + 97;
            scrambleString = scrambleString + " " + (char)ascii;

        }
        System.out.println("Unscramble this string: ");
        System.out.println(scrambleString);

        int n = scrambleString.length();


        for (int i = 0; i < n-1; i++) {

            String minIndex = scrambleString.substring(i, i+1);

            for (int j = i+1; j < n; j++) {
                if (scrambleString.substring(j, j + 1).compareTo(minIndex) < 0) {
                    minIndex = scrambleString.substring(j, j + 1);

                }
                solutions = solutions + minIndex;
            }
        }
        System.out.println(solutions);

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

            if (input == answer){
                return true;
            }
            else {
                return false;
            }
        }
    public static boolean subtraction(int randOne, int randTwo, int input){
            int answer = randOne - randTwo;
            if (input == answer){
                return true;
            }
            else {
                return false;
            }
    }

    public static boolean multiplication(int randOne, int randTwo, int input){
        int answer = randOne * randTwo;
        if (input == answer){
            return true;
        }
        else {
            return false;
        }
    } public static boolean division(int randOne, int randTwo, int input){
        int answer = randOne / randTwo;
        if (input == answer){
            return true;
        }
        else {
            return false;
        }
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
