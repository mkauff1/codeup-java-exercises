import java.util.Arrays;
import java.util.Random;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] person = new String[3];
        person[0] = "Ryan";
        person[1] = "Richard";
        person[2] = "Mersedyes";

        for (String s : person) {
            System.out.println(s);
        }

        String[] addedPerson = new String[]{"Jeff", "Ry", "Rebecca", "Pat", "Casey"};
        addPerson(person); //Whatever array I call, it prints here as the random

//        for(String person : person){
//            System.out.println("New");
//        }
    }

    public static String randomPerson(String[] addedPerson) {
        Random random = new Random();
        int index = random.nextInt(addedPerson.length);
        return addedPerson[index];
    }

    public static void addPerson(String[] person) {
        String[] newPerson = Arrays.copyOf(person, person.length +1);

        for (int i = 3; i < newPerson.length; i++) {
            newPerson[i] = randomPerson(newPerson);
        }
//        newPerson[3] = randomPerson;
//        newPerson[4] = randomPerson;

        System.out.println("\nNew Array:");
        for (int i = 0; i < newPerson.length; i++)
            System.out.print(newPerson[i] + " ");
    }
}

//    public static String[] addPerson(String[] person) {
//        String[] newPerson = Arrays.copyOf(person, 5);
//
//        for (int i = 0; i < newPerson.length; i++) {
//            String randomPerson = randomPerson(person);
//            newPerson[i] = randomPerson;
//        }
////        System.out.println("\nNew Array:");
////        for (int i = 0; i < newPerson.length; i++) {
////            System.out.print(newPerson[i] + " ");
////        }
//        return newPerson;
//    }