import java.util.Arrays;

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
    }

//    public static String[] addPerson(String[] person, String addedPerson) {
//        //String [] newPersons = new String[person.length +1];
//        int[] addedPerson = person.copyOf(person, 4);
//    }
}
