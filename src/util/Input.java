package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String userInput = this.scanner.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + "!");
        int userInput = this.scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter an decimnal between " + min + " and " + max + "!");
        double userInput = this.scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }
    double getDouble() {
        return this.scanner.nextDouble();
    }
}
