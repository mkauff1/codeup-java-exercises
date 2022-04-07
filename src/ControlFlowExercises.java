import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Does user live in the City? (Answer true/ false: ");
//        String userInputCity = scanner.next();
//        boolean livesInCity;
//
//        if (userInputCity.equalsIgnoreCase("true")) {
//            livesInCity = true;
//        } else {
//            livesInCity = false;
//        }
//
//        System.out.println("Does user have Transportation? (Answer true/ false: ");
//        String userInputTransport = scanner.next();
//        boolean hasTransportation;
//
//        if (userInputTransport.equalsIgnoreCase("true")){
//            hasTransportation = true;
//        } else {
//            hasTransportation = false;
//        }
//
//        boolean canComeInPerson  = livesInCity && hasTransportation;// Boolean expression combo of the two
//        if (canComeInPerson) {
//                System.out.println("Yay");
//        } else {
//                System.out.println("Nay");
//            }
//
//        System.out.printf("User lives in city: %s%n User has transportation %s%n User can come in person %s%n", livesInCity, hasTransportation, canComeInPerson);

        // 1
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j < 100);
//
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);
//
//        long k = 2;
//        do {
//            System.out.println(k);
//            k = k * k;
//        } while (k < 1000000);
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }
//
//        for (int m = 100; m >= -10; m -= 5) {
//            System.out.println(m);
//        }
//
//        for (long l = 2; l < 1000000; l *= l) {
//            System.out.println(l);
//        }

        // 2
//        for (int b = 1; b <= 100; b++){
//            //System.out.println(b);
//            if ((b %3 == 0) && (b %5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (b %5 == 0) {
//                System.out.println("Buzz");
//            } else if (b %3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(b);
//            }
//        }

        // 3
//        do {
//            System.out.println("What number would you like to go up to?: ");
//            final double XMAX = Integer.parseInt(scanner.nextLine());
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int m = 1; m <= XMAX; m++) {
//                System.out.printf("%-6d | %-7d | %-6d%n", m, m * m, m * m * m);
//            }
//        } while (true); // infinite loop

//            final int NMAX = 3;
//
//            for (int n = 1; n <= NMAX; n++) {
//                System.out.printf("%10d", n);
//            }
//            System.out.println();
//            for (int n = 1; n <= NMAX; n++) {
//                System.out.printf("%10s", "---");
//            }
//            System.out.println();
//
//            for (double x = 1; x <= XMAX; x++) {
//                for (int n = 1; n <= NMAX; n++) {
//                    System.out.printf("%10.0f", Math.pow(x, n));
//                }
//                System.out.println();
//            }
//
//            System.out.println("Would you like to continue? (y/n): ");
//            String userInputContinue = scanner.next();
//            boolean endProgram;
//
//            if (userInputContinue.equalsIgnoreCase("y")) {
//                endProgram = true;
//            } else {
//                endProgram = false;
//            }


        // 4
        boolean userInput = true;
        do {
            System.out.println("Enter a number from 0 - 100: ");
            int i = Integer.parseInt(scanner.nextLine());

            if ((i >= 88) && (i <= 100)) {
                System.out.println("A");
            } else if ((i >= 80) && (i <= 87)) {
                System.out.println("B");
            } else if ((i >= 67) && (i <= 79)) {
                System.out.println("C");
            } else if ((i >= 60) && (i <= 66)) {
                System.out.println("D");
            } else if ((i >= 0) && (i <= 59)) {
                System.out.println("F");
            }

            System.out.println("Do you want to continue (y/n): ");
            String userWantsToContinue = scanner.next();


            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userInput = false;
            }

        } while (userInput);
    }
}
