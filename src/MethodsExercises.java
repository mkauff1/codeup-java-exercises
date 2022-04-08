import java.util.Scanner;
public class MethodsExercises {

    public static int addition (int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction (int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication (int num1, int num2) {
        return num1 * num2;
//        long result;
//        for (int i = num1; i <= num2; i *= num2) {
//            result = num2 * num1;
//        }
//        return result;
    }

    public static int division (int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus (int num1, int num2) {
        return num1 % num2;
    }

    public static void main (String[] args) {
//        System.out.println(addition(1, 3));
//        System.out.println(subtraction(2, 1));
//        System.out.println(multiplication(2, 2));
//        System.out.println(division(6, 2));
//        System.out.println(modulus(4, 2));

//        getInteger(1, 10);
//        getFactorial(1, 10);
        diceRoll();
    }

    public static void getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = Integer.parseInt(sc.nextLine());

        if ((userInt > min) && (userInt <= max)) {
            System.out.println("That number is valid");
        } else {
            getInteger(min, max);
        }
    }

    public static void getFactorial(int min1, int max1) {
        Scanner sc = new Scanner(System.in);
        boolean userInput = true;
        do {
            sc.nextLine(); //Needs work - Have to hit space to open command, but it wont run through program without it.
            System.out.printf("Enter a number between %d and %d: ", min1, max1);
            int userInt = Integer.parseInt(sc.nextLine());
            if ((userInt > min1) && (userInt <= max1)) {
                System.out.printf("You entered %d%n", userInt);
                int fact = 1;
                for (long i = 1; i <= userInt; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + userInt + "! is: " + fact);
            } else {
                getFactorial(min1, max1);
            }
            System.out.println("Do you want to continue (y/n): ");
            String userWantsToContinue = sc.next();

            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userInput = false;
            }
        } while (userInput);
    }

    public static void diceRoll () {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides does your pair of dice have?");
        int dieSides = Integer.parseInt(sc.nextLine());
        System.out.println("Enter how many times you would like to roll?");
        int numOfRolls = Integer.parseInt(sc.nextLine());
        System.out.println("Please roll the dice");

        int min = 1;
        int range = dieSides - min + 1;
        for(int i = 0; i < numOfRolls; i++) {
            int rand = (int) (Math.random() * range) + min;
            int rand1 = (int) (Math.random() * range) + min;
            System.out.printf("Die One: %d  ||  Die Two: %d%n", rand, rand1);
        }

        System.out.println("Do you want to Roll again? (y/n): ");
        String userWantsToContinue = sc.next();

        if (userWantsToContinue.equalsIgnoreCase("y")) {
            diceRoll();
        } else {
            return;
        }
    }

}


