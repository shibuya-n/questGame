public class Convert {



    public boolean win = false;

    public Convert () {

    }

    public boolean stageOne() {
        String randBinary = binaryGenerator();
        System.out.println("Convert this binary code to hex form: " + randBinary);
        System.out.println(binaryToHex(randBinary));


        if (Quest.getInput().equals(binaryToHex(randBinary).toLowerCase())) {

            return true;
        }
        else {
            return false;
        }
    }
    public boolean stageTwo(){
        String randBinary = binaryGenerator();
        System.out.println("Convert this binary code to decimal form: " + randBinary);
        String decimal = String.valueOf(binaryToDecimal(randBinary));
        System.out.println(decimal);


        String input = Quest.getInput();


        if (input.equals(decimal.toLowerCase())){

            return true;
        }
        else {
            return false;
        }
    }
    public boolean stageThree(){
        String randBinary = binaryGenerator();
        String randDecimal = String.valueOf(binaryToDecimal(randBinary));
        System.out.println("Convert this decimal code to hex form: " + randDecimal);
        String toHex = binaryToHex(randBinary);

        System.out.println(toHex);




        if (Quest.getInput().equals(toHex.toLowerCase())) {

            return true;
        }
        else {
            return false;
        }
    }


    public static String binaryGenerator(){
        String binary = "";
        for (int i = 0; i < 8; i++){
            double random = Math.random();
            if(random < 0.5) {
                binary = binary + "0";
            }
            else {
                binary = binary + "1";
            }

        }
        return binary;
    }

    public static int binaryToDecimal(String input) {
        int total = 0;
        int j = 0;


        for (int i = input.length() - 1; i >= 0; i--) {
            String num = input.substring(i, i + 1);

            int x = Integer.parseInt(num);


            if (x == 1) {
                total += Math.pow(2, j);

                j++;

            } else {
                j++;
            }

        }

        return total;
    }

    public static String binaryToHex(String input) {
        String first = input.substring(0, 4);
        String last = input.substring(4, input.length());

        String[] binaryCode = {first, last};

        StringBuilder hex = new StringBuilder();

        for (int i = 0; i < binaryCode.length; i++) {
            switch (binaryCode[i]) {
                case "0000":
                    hex.append("0");
                    break;
                case "0001":
                    hex.append("1");
                    break;
                case "0010":
                    hex.append("2");
                    break;
                case "0011":
                    hex.append("3");
                    break;
                case "0100":
                    hex.append("4");
                    break;
                case "0101":
                    hex.append("5");
                    break;
                case "0110":
                    hex.append("6");
                    break;
                case "0111":
                    hex.append("7");
                    break;
                case "1000":
                    hex.append("8");
                    break;
                case "1001":
                    hex.append("9");
                    break;
                case "1010":
                    hex.append("A");
                    break;
                case "1011":
                    hex.append("B");
                    break;
                case "1100":
                    hex.append("C");
                    break;
                case "1101":
                    hex.append("D");
                    break;
                case "1110":
                    hex.append("E");
                    break;
                case "1111":
                    hex.append("F");
                    break;
            }


        }

        return hex.toString();
    }


}




