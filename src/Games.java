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

        String x = "";
        String solutions = "";

        for (int i = 0; i < 6; i++) {

            int ascii = (int)(Math.random() * 26) + 97;
            x = x + " " + (char)ascii;

        }
        System.out.println("Unscramble this string: ");
        System.out.println(x);

        for (int i = 0; i < name.length(); i++){


            if (x.length() == 1) {
                solution += temp;
                break;
            }
            else {
                scramble += temp.charAt(random);

                temp = temp.substring(0, random) + temp.substring(random + 1);
            }

        }
    }
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
