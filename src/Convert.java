import java.util.*;

public class Convert {
    public static String output;

    public int stage;

    public Convert (int userStage){
        stage = userStage;
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

    public static void hexAsk() {
        Scanner hexInput = new Scanner(System.in);
        System.out.println("Insert a hex code");
        String hex = hexInput.nextLine().toUpperCase();

        if (output.equals("decimal")) {

            System.out.println("Decimal conversion is: " + hexToDecimal(hex));
            ask();

        } else if (output.equals("binary")) {

            System.out.println("Binary conversion is is: " + decimalToBinary(hexToDecimal(hex)));
            ask();
        } else {
            System.out.println("Wrong input. Try again.");
            hexAsk();
        }
    }

    public static int hexToDecimal(String input) {
        int total = 0;
        int j = 0;

        ArrayList<Integer> individualHex = new ArrayList<>();


        for (int i = input.length() - 1; i >= 0; i--) {
            String num = input.substring(i, i + 1);
            switch (num) {
                case "A":
                    individualHex.add(10);
                    break;
                case "B":
                    individualHex.add(11);
                    break;
                case "C":
                    individualHex.add(12);
                    break;
                case "D":
                    individualHex.add(13);
                    break;
                case "E":
                    individualHex.add(14);
                    break;
                case "F":
                    individualHex.add(15);
                    break;

                default:
                     individualHex.add(Integer.parseInt(num));

            }

        }
        for (int i = 0; i < individualHex.size(); i++){
            total += individualHex.get(i) * Math.pow(16, j);

            j++;
        }
        return total;
        }

    public static void decimalAsk() {
        Scanner decInput = new Scanner(System.in);
        System.out.println("Insert a decimal code");
        int decimal = decInput.nextInt();

        if (output.equals("binary")) {

            System.out.println("Decimal conversion is: " + decimalToBinary(decimal));
            ask();

        } else if (output.equals("hex")) {





            System.out.println("Hex conversion is: " + binaryToHex(decimalToBinary(decimal)));
            ask();
        } else {
            System.out.println("Wrong input. Try again.");
            decimalAsk();
        }
    }
    public static String decimalToBinary(int input){
        ArrayList<String> binaryCode = new ArrayList<>();
        String binary = "";

        int temp = input;
        while (temp > 0) {
            int x = temp/2;
            binaryCode.add(String.valueOf(temp % 2));
            temp = x;
        }
        for (int i = binaryCode.size()-1; i >= 0; i--){
            binary += binaryCode.get(i);
        }
        if (binary.length() == 8){
            return binary;
        }
        else {
            int runTime = 8 - binary.length();
            for (int i = 0; i < runTime; i++){
                binary = "0" + binary;
            }
        }

        return binary;
    }
}




