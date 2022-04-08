import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userInput = true;
        System.out.println("Say hello to Bob: ");
        do {
            String convo = scanner.nextLine();
            System.out.println(convo);
            String nextConvo = scanner.nextLine();

            if (nextConvo.endsWith("?")) {
                System.out.println("Sure");
            } else if (nextConvo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (nextConvo.startsWith("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Do you want to continue (y/n): ");
            String userWantsToContinue = scanner.next();

            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userInput = false;
            }

        } while (userInput);
    }
}
