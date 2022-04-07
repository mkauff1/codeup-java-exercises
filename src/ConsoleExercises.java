import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey user, enter an integer please: ");
        int userInt = scanner.nextInt();

        System.out.println("Enter 3 words: ");
        String userInputOne = scanner.next();
        String userInputTwo = scanner.next();
        String userInputThree = scanner.next();
        System.out.printf("You entered: %n$s%n%s%n%s%n", userInputOne, userInputTwo, userInputThree);

        System.out.println("Enter a sentence: ");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.printf("You entered: %n%s%n", userSentence);

        System.out.println("Enter the width: ");
        int roomWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the height: ");
        int roomHeight = Integer.parseInt(scanner.next());
        System.out.println("The perimeter is: " + ((2 * roomWidth) + (2 * roomHeight)));
        System.out.println("The area is: " + (roomHeight * roomWidth));

    }
}