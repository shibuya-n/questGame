public class Trivia {

    int questionNumber;



    public Trivia (int x) {
        questionNumber = x;
    }

    public boolean question(){
        switch (questionNumber) {
            case 1 :
                System.out.println("Who is the computer science teacher?");
            case 2 :
                System.out.println("Who is the head of the computer science department?");
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
                System.out.println("");
        }
    }
}
