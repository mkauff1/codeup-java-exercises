package util;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

//    public Input(){
//        this.scanner = new Scanner(System.in);
//    }

    public static String getString() {
        //boolean prompt = true;
        //System.out.println(prompt);
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.println("Enter yes or no");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return yesNo();
    }

    public static int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + "!");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public static int getInt() {
        System.out.println("Enter an Integer: ");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return getInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal between " + min + " and " + max + "!");
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }
    public static double getDouble() {
        System.out.println("Enter a decimal: ");
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return getDouble();
    }

    public static int getBinary() {
        System.out.println("Enter a binary number: ");
        int num = Integer.parseInt(scanner.nextLine());
        try {
            //return Integer.parseInt(Integer.toBinaryString(num));
            return Integer.parseInt(String.valueOf(num), 2);

        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        return getBinary();
    }

//    public static int getHex() {
//        System.out.println("Enter a number: ");
//        int hex = Integer.parseInt(scanner.nextLine());
//
//        hex = hex.toUpperCase();
//        int val = 0;
//        for (int i = 0; i < hex.length(); i++)
//        {
//            char c = hex.charAt(i);
//            int d = digits.indexOf(c);
//            val = 16 * val + d;
//        }
//        try {
//            return Integer.parseInt(String.valueOf(val), 16);
//
//        } catch (NumberFormatException nfe) {
//            nfe.printStackTrace();
//        }
//        return getHex();
//    }
}
