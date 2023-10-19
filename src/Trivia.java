public class Trivia {

    int questionNumber;



    public Trivia (int x) {
        questionNumber = x;
    }

    public boolean question(){
        String answer;



        switch (questionNumber) {

            case 1 :

                System.out.println("Who is the computer science teacher?");
                System.out.println("A. Mr. Chau");
                System.out.println("B. Mr. Woodard");
                System.out.println("C. Dr. Hackenburg");
                System.out.println("D. Ms. Romero");
                answer = "a";

                return answerCheck(Quest.getInput(), answer);
            case 2 :
                System.out.println("Who is the head of the computer science department?");
                System.out.println("A. Mr. Farrell");
                System.out.println("B. Ms. Jacoby");
                System.out.println("C. Dr. Hackenburg");
                System.out.println("D. Mr. Chau");
                answer = "d";

                return answerCheck(Quest.getInput(), answer);
            case 3 :
                System.out.println("What does 'int' stand for in Java?");
                System.out.println("A. Intentionally Feeding");
                System.out.println("B. Interchangeable");
                System.out.println("C. International");
                System.out.println("D. Integer");
                answer = "d";

                return answerCheck(Quest.getInput(), answer);
            case 4 :
                System.out.println("Where is the computer science classroom located?");
                System.out.println("A. Stuart Hall");
                System.out.println("B. Siboni");
                System.out.println("C. Vietnam");
                System.out.println("D. Convent");
                answer = "b";

                return answerCheck(Quest.getInput(), answer);
            case 5 :
                System.out.println("What is the difference between a 'double' and an 'int'?");
                System.out.println("A. Doubles can store decimals");
                System.out.println("B. Integers can store decimals");
                System.out.println("C. Doubles can have negative numbers");
                System.out.println("D. Doubles can store Strings and Integers");
                answer = "a";

                return answerCheck(Quest.getInput(), answer);
            case 6 :
                System.out.println("How many bits can a single byte store?");
                System.out.println("A. 8");
                System.out.println("B. 20");
                System.out.println("C. 15");
                System.out.println("D. 69");
                answer = "a";

                return answerCheck(Quest.getInput(), answer);
            case 7 :
                System.out.println("How would one print a statement in java?");
                System.out.println("A. print();");
                System.out.println("B. System.print();");
                System.out.println("C. System.out.println();");
                System.out.println("D. out.println()");
                answer = "c";

                return answerCheck(Quest.getInput(), answer);
            case 8 :
                System.out.println("Which data type is used to store text?");
                System.out.println("A. Char");
                System.out.println("B. Float");
                System.out.println("C. String");
                System.out.println("D. Double");
                answer = "c";

                return answerCheck(Quest.getInput(), answer);
            case 9 :
                System.out.println("What does 12 % 2 equal?");
                System.out.println("A. 12/2");
                System.out.println("B. 6");
                System.out.println("C. 0");
                System.out.println("D. 4");
                answer = "c";

                return answerCheck(Quest.getInput(), answer);
            case 10 :
                System.out.println("What is the difference between float and a double?");
                System.out.println("A. Floats can represent larger numbers compared to a double");
                System.out.println("B. Doubles can represent larger numbers compared to a float");
                System.out.println("C. Man, I don't know");
                System.out.println("D. Floats can store decimals");
                answer = "b";

                return answerCheck(Quest.getInput(), answer);
            case 11 :
                System.out.println("What net force is required to accelerate a 15 kg box from a velocity of 6.0 ms–1 to 12 ms–1 in 2.0 s?");
                System.out.println("A. 25N");
                System.out.println("B. 45N");
                System.out.println("C. 60N");
                System.out.println("D. 55N");
                answer = "b";

                return answerCheck(Quest.getInput(), answer);
            case 12 :
                System.out.println("What is a boolean?");
                System.out.println("A. A true or false statement");
                System.out.println("B. A bean");
                System.out.println("C. That's scary");
                System.out.println("D. The name of a person");
                answer = "a";

                return answerCheck(Quest.getInput(), answer);
            case 13 :
                System.out.println("How would you cast a string to an integer?");
                System.out.println("A. valueOf();");
                System.out.println("B. toString();");
                System.out.println("C. Integer.parseInt(); ");
                System.out.println("D. String.valueOf();");
                answer = "d";

                return answerCheck(Quest.getInput(), answer);
        }
        return true;
    }
    public boolean answerCheck(String input, String answer){
        return input.equals(answer);
    }
}
