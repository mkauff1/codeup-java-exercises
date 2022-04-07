import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does user live in the City? (Answer true/ false: ");
        String userInputCity = scanner.next();
        boolean livesInCity;

        if (userInputCity.equalsIgnoreCase("true")) {
            livesInCity = true;
        } else {
            livesInCity = false;
        }

        System.out.println("Does user have Transportation? (Answer true/ false: ");
        String userInputTransport = scanner.next();
        boolean hasTransportation;

        if (userInputTransport.equalsIgnoreCase("true")){
            hasTransportation = true;
        } else {
            hasTransportation = false;
        }

        boolean canComeInPerson  = livesInCity && hasTransportation;// Boolean expression combo of the two
        if (canComeInPerson) {
                System.out.println("Yay");
        } else {
                System.out.println("Nay");
            }

        System.out.printf("User lives in city: %s%n User has transportation %s%n User can come in person %s%n", livesInCity, hasTransportation, canComeInPerson);
    }
}
