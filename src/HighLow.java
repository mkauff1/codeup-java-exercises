import java.sql.SQLOutput;
import java.util.Scanner;
public class HighLow {
    public static void main (String[] args) {
    guessingGame();
    }

    public static void guessingGame () {
        Scanner sc = new Scanner(System.in);

        // Generate random number
        int ranNum = (int) (Math.random() * 101);

        int userGuess = -1;
        int attempts = 0;

        while (userGuess != ranNum) {
            System.out.println("Pick a random number between 1 - 100");
            userGuess = Integer.parseInt(sc.nextLine());
            attempts += 1;
            int maxGuesses = 5;
            System.out.printf("You have made %d guesses.%n", attempts);

            if (attempts < maxGuesses) {
                if (ranNum == userGuess) {
                    System.out.println("GREAT GUESS");
                } else if (ranNum < userGuess) {
                    System.out.println("You are too high");
                } else {
                    System.out.println("You are too low");
                }
            } else {
                System.out.printf("%d guesses is the max.%n", attempts);
                System.out.println("Game Over");
                System.out.println("You Lose");
                System.out.println("I said good day sir!");
                System.out.println("Do you want to play again? (y/n): ");
                String userWantsToContinue = sc.next();

                if (userWantsToContinue.equalsIgnoreCase("y")) {
                    guessingGame();
                } else {
                    return;
                }
            }
        }
    }
}
