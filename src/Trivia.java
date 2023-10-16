public class Trivia {

    int questionNumber;



    public Trivia (int x) {
        questionNumber = x;
    }

    public int question(){
        String answer = "";
        switch (questionNumber) {
            case 1 :
                System.out.println("Who is the computer science teacher?");
                System.out.println("A. Mr. Chau");
                System.out.println("B. Mr. Woodard");
                System.out.println("C. Dr. Hackenburg");
                System.out.println("D. Ms. Romero");
                answer = "a";

                if (answerCheck(Quest.getInput(), answer)){
                    return 1;
                } else {
                    return -1;
                }
            case 2 :
                System.out.println("Who is the head of the computer science department?");
                System.out.println("A. Dr. Hackenburg");
                System.out.println("B. Mr. Woodard");
                System.out.println("C. Mr. Chau");
                System.out.println("D. Ms. Romero");
                answer = "b";

                if (answerCheck(Quest.getInput(), answer)){
                    return 1;
                } else {
                    return -1;
                }
            case 3 :
                System.out.println("What does 'int' stand for?");
            case 4 :
                System.out.println("Where is the computer science classroom located?");
            case 5 :
                System.out.println("What is the difference between a 'double' and an 'int'?");
            case 6 :
                System.out.println("How many bits can a single byte store?");
            case 7 :
                System.out.println("How would one print a statement in java?");
            case 8 :
                System.out.println("Which data type is used to store text?");
            case 9 :
                System.out.println("");
            case 10 :
                System.out.println("");
            case 11 :
                System.out.println("");
            case 12 :
                System.out.println("");
            case 13 :
                System.out.println("What net force is required to accelerate a 15 kg box from a velocity of 6.0 ms^-1 to 12 ms^-1 in 2.0s?");
        }
    }
    public boolean answerCheck(String input, String answer){
        if (input.equals(answer)) {
            return true;
        }
        else {
            return false;
        }
    }
}
