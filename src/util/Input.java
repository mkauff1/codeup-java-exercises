package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);



//    String getString()
    public boolean yesNo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \"yes\" or \"no\"");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        }
        return yesNo();
    }
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()

}
