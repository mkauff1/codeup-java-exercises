import java.util.Scanner;

public class App {
    public static void main(String [] args) {
        calculator();
        madLibs();
    }

    public static void calculator() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter in first number: ");
        double num1 = keyboardInput.nextDouble();
        System.out.print("Enter in second number: ");
        double num2 = keyboardInput.nextDouble();
        System.out.println(num1 + num2);
    }

    public static void madLibs() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a color: ");
        String color = keyboardInput.nextLine();
        System.out.print("Enter a plural noun: ");
        String pluralNoun = keyboardInput.nextLine();
        System.out.print("Enter a celebrity: ");
        String celebrity = keyboardInput.nextLine();
        System.out.println("Roses are " + color + " \n"
                        + pluralNoun + " are blue \n"
                        + "I love " + celebrity);

    }
}
