public class Games {
    String name;
    int points;
    int level;

    boolean win = false;

    public Games(String x){
        name = x;
    }


    public void scramble(){
        System.out.println("Welcome to the scramble quest, challenger " + name);
    }public void math(){
        if (this.level <=2) {
            System.out.println("You aren't strong enough for this level yet. :(");

        }else {
            System.out.println("Welcome to the math quest, challenger " + name);
            //add challenge (binary convert?)
        }
    }public void trivia(){
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
