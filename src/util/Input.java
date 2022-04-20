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

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter an decimnal between " + min + " and " + max + "!");
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }
    double getDouble() {
        return scanner.nextDouble();
    }
}
