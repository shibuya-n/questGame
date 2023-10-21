
public class Games {
    String name;
    int points;
    int level = 1;

    int mathStage = 1;



    static boolean triviaWin = false;

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
        else if (this.points >= 6 && completedMath) {
            this.level++;
            System.out.println();
            System.out.println("Congrats! You leveled up! The next stage is unlocked.");
            System.out.println();
        }
        else if (this.points >= 9 && completedTrivia) {
            this.level++;
            System.out.println();
            System.out.println("Congrats! You leveled up! The FINAL BOSS is unlocked.");
            System.out.println();
        }
        else {
            System.out.print("");
        }
    }
    public void scramble(){
        System.out.println();
        System.out.println("Welcome to the Scramble Arena, challenger " + name);

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

        if (Quest.getInput().equals(solutions)) {
            this.points++;
            System.out.println();
            System.out.println("You've calmed down the angry horde of letters!");
            System.out.println("You gained a point! Current points: " + this.points );
            System.out.println();
            completedScramble = true;
            checkPlayer();

        }
        else {
            System.out.println("Wrong! The horde does not yield and overwhelms you.");
            System.out.println("You black out...");
            Quest.sleep(500);
            System.out.println("You come to, back at where you first started.");
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
            System.out.println("Preparing numbers for battle...");
            Quest.sleep(500);
            System.out.println("You approach a shady group of merchants at a bar...");
            Quest.sleep(500);
            System.out.println("They start throwing numbers at you with deadly precision! Quick, use your math skills to nullify their attacks!");
            System.out.println(name + ", MOVE!");


            if (mathStage == 1) {
                System.out.println();
                System.out.println("Stage 1: Addition");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " + " + y + "? ");

                if (addition(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Correct! You jump exactly " + (x+y) + " meters, dodging the attacks. +1 point.");
                    System.out.println("");

                    math();
                } else {
                    System.out.println("Wrong answer! You pass out from the overwhelming guilt and shame that one gets when they can't do basic math.");
                    Quest.sleep(500);
                    System.out.println("You wake up at the same place you left off...");
                    Quest.sleep(500);
                    math();
                }
            } else if (mathStage == 2) {
                System.out.println();
                System.out.println("Stage 2: Subtraction");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " - " + y + "? ");

                if (subtraction(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Right Answer! You recite the answer, creating a shield that blocks the attacks. +1 point.");
                    System.out.println("");

                    math();
                } else {
                    System.out.println("Wrong answer! You pass out from the overwhelming guilt and shame that one gets when they can't do basic math.");
                    Quest.sleep(500);
                    System.out.println("You wake up at the same place you left off...");
                    Quest.sleep(500);
                    math();
                }

            } else if (mathStage == 3) {
                System.out.println();
                System.out.println("Stage 3: Multiplication");
                int x = randomInt();
                int y = randomInt();
                System.out.println("What is " + x + " * " + y + "? ");

                if (multiplication(x, y, Integer.parseInt(Quest.getInput()))) {
                    mathStage++;
                    points += 1;
                    System.out.println("Nice! You create a " + (x*y) + " meter long sword out of pure energy and slice the rogue numbers. +1 point.");
                    System.out.println("");

                    math();
                } else {
                    System.out.println("Wrong answer! You pass out from the overwhelming guilt and shame that one gets when they can't do basic math.");
                    Quest.sleep(500);
                    System.out.println("You wake up at the same place you left off...");
                    Quest.sleep(500);
                    math();
                }
            }
            else {
                System.out.println("Stage 4: Division");
                double x = randomInt();
                double y = randomInt();
                System.out.println("What is " + x + " / " + y + "? Round to the 2nd decimal place. ");

                if (division(x, y, Double.parseDouble(Quest.getInput()))) {
                    points += 1;
                    System.out.println("Right Answer! You drop to the floor with a reaction speed of " + (x/y) + " seconds. +1 point.");
                    System.out.println("");

                    completedMath = true;
                    System.out.println("You dodged all the attacks! The merchants look at you in fear and run away. Points: " + this.points);
                    mathStage = 1;

                    checkPlayer();
                } else {
                    System.out.println("Wrong answer! You pass out from the overwhelming guilt and shame that one gets when they can't do basic math.");
                    Quest.sleep(500);
                    System.out.println("You wake up at the same place you left off...");
                    Quest.sleep(500);
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
    public static boolean division(double randOne, double randTwo, double input) {

        double answer = randOne / randTwo;


        return input == Math.round(answer * 100.0) / 100.0;
    }

    public void trivia(){
        if (this.level < 3) {
            System.out.println("You aren't strong enough for this level yet. :(");

        }else {
            System.out.println("Organizing trivia questions...");
            Quest.sleep(500);
            System.out.println("You approach an elderly man with a long, white beard...");
            Quest.sleep(500);
            System.out.println("He offers you a strange sword, won only if you get all his trivia questions right!");
            System.out.println("You sit down across from him...");
            Quest.sleep(500);
            System.out.println();
            System.out.println("'Hello, " + name + "', the old man greets...");

            System.out.println();
            System.out.println("Make sure to get all these questions right! You will have to restart if you get a question wrong!");
            System.out.println("Example input answer: a");
            System.out.println();

            System.out.println("STAGE ONE");
            stageOne();

            if (triviaWin){
                completedTrivia = true;
                this.points += 6;
                System.out.println("Good job! Challenge complete! Points: " + this.points);


                checkPlayer();
            }

        }

        }
    public static void stageOne(){
        int stagePoints = 1;
        while (stagePoints <= 3) {

            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + stagePoints + " of 3");
            Trivia x = new Trivia(random);


            if (x.question()) {
                System.out.println();
                System.out.println("Correct!");
                System.out.println();
                stagePoints++;
            } else {
                System.out.println();
                System.out.println("Wrong answer! You pass out, right in front of the strange man.");
                System.out.println("He observes you closely...");
                System.out.println();

                Quest.sleep(500);
                System.out.println("You come to, the same place you started.");
                stageOne();
            }
        }
        stageTwo();

    }
    public static void stageTwo(){
        System.out.println("STAGE TWO");

        int stagePoints = 1;

        while (stagePoints <= 4){
            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + stagePoints + " of 4");
            Trivia x = new Trivia(random);


            if (x.question()) {
                System.out.println();
                System.out.println("Correct!");
                System.out.println();
                stagePoints++;
            } else {
                System.out.println();
                System.out.println("Wrong answer! You pass out, right in front of the strange man.");
                System.out.println("He observes you closely...");
                System.out.println();

                Quest.sleep(500);
                System.out.println("You come to, the same place you started.");
                stageTwo();
            }
        }
        stageThree();

    }
    public static void stageThree() {
        System.out.println("STAGE THREE");
        int stagePoints = 1;

        while (stagePoints <= 5) {
            int random = (int) (Math.random() * 13) + 1;
            System.out.println("Question " + stagePoints + " of 5");
            Trivia x = new Trivia(random);


            if (x.question()) {
                System.out.println();
                System.out.println("Correct!");
                System.out.println();
                stagePoints++;
            } else {
                System.out.println();
                System.out.println("Wrong answer! You pass out, right in front of the strange man.");
                System.out.println("He observes you closely...");
                System.out.println();

                Quest.sleep(500);
                System.out.println("You come to, the same place you started.");
                stageThree();
            }
        }

        triviaWin = true;

    }

    public void challenge(){
        if (this.level <=3) {
            System.out.println("You aren't strong enough for this level yet. :(");
        }else {
            System.out.println("There seems to be inscriptions on the sword...");
            System.out.println("Would you like to look closer? (yes/no)");
            if (Quest.getInput().equals("yes")){
                System.out.println("You look closer.");
                Quest.sleep(500);
                System.out.println("You suddenly feel an overwhelming headache and you close your eyes");
                Quest.sleep(500);
                System.out.println("You feel a hot, steamy breath on your forehead.");
                Quest.sleep(500);
                System.out.println("IT'S A BINARY DRAGON! DO THE RIGHT CONVERSIONS TO DEFEAT IT!");
                Quest.sleep(500);;
                System.out.println();
                System.out.println("The dragon roars, challenging you to a battle of wits...");
                Quest.sleep(1000);
                //add challenge (binary convert?)

                Convert game = new Convert();
                int challengePoints = 1;
                System.out.println("It looks at you expectantly, and finally asks you a question: ");
                while (!game.win){

                    if (challengePoints <= 3) {
                        System.out.println("Challenge #1 - Binary to Hex (" + challengePoints + "/9)");

                        if (game.stageOne()){

                            System.out.println();

                            System.out.println("Correct! The dragon looks at you approvingly... only " + (9 - challengePoints) + " more questions to go...");


                            challengePoints++;
                        }
                        else {
                            System.out.println();


                            System.out.println("Wrong answer! You slowly fade out of consciousness, the pressure of converting code too overwhelming...");
                            System.out.println();
                            Quest.sleep(1000);
                            System.out.println("You wake up, back at where you left off...");
                        }

                    }
                    else if (challengePoints <= 6){
                        System.out.println("Challenge #2 - Binary to Decimal (" + challengePoints + "/9)");
                        if (game.stageTwo()){
                            System.out.println();

                            System.out.println("Correct! The dragon looks at you approvingly... only " + (9 - challengePoints) + " more questions to go...");


                            challengePoints++;
                        }
                    }
                    else {


                        if (challengePoints >= 10){
                            System.out.println("The dragon seems satisfied...");
                            Quest.sleep(2500);
                            System.out.println("Your head starts to swirl...");
                            Quest.sleep(2500);
                            System.out.println("You appear back in the physical world, dazed.");
                            System.out.println("Exhausted, you fall asleep, right then and there.");
                            Quest.sleep(2500);
                            System.out.println();
                            Quest.sleep(2500);
                            System.out.println();
                            Quest.sleep(2500);
                            System.out.println();
                            Quest.sleep(2500);
                            System.out.println("Thanks for playing my game!");
                            System.out.println("-----------STATS-----------");
                            System.out.println("Player " + name + "'s total points: " + points);
                            System.out.println("Thanks for playing!");
                            break;
                        }
                        else if (game.stageThree()){
                            System.out.println("Challenge #3 - Hex to Decimal (" + challengePoints + "/9)");

                            System.out.println();

                            System.out.println("Correct! The dragon looks at you approvingly... only " + (9 - challengePoints) + " more questions to go...");
                            System.out.println();


                            challengePoints++;


                        }
                        else {
                            System.out.println("Wrong answer! You slowly fade out of consciousness, the pressure of converting code too overwhelming...");
                            System.out.println();
                            Quest.sleep(1000);
                            System.out.println("You wake up, back at where you left off...");
                        }
                    }
                }
                this.win = true;

            }
            else {
                System.out.println("Coward.");
                System.out.println();
            }


        }





        }
    }

