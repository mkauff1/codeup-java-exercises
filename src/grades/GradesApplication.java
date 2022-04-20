package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = getStudents();
//        System.out.println(students.keySet().stream().reduce("",(allNames, currentName) -> {
//            return allNames + "\n -> " + currentName;
//        }));

        printAllStudents(students);

    }

    private static HashMap<String, Student> getStudents() {
        HashMap<String, Student> students = new HashMap<>();

        Student grace = new Student("Grace K");
        grace.addGrade(90);
        grace.addGrade(70);
        grace.addGrade(50);
        students.put(grace.getName(), grace);

        Student fernando = new Student("Fernando B");
        fernando.addGrade(90);
        fernando.addGrade(70);
        fernando.addGrade(50);
        students.put(fernando.getName(), fernando);

        Student justin = new Student("Justin R");
        justin.addGrade(80);
        justin.addGrade(85);
        justin.addGrade(90);
        students.put(justin.getName(), justin);

        return students;
    }

    public static void printAllStudents(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{

            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }

            System.out.println("What student would you like to see more information on?\n");
            String typedKey = Input.getString();
            if(students.containsKey(typedKey)){

                Student currentStudent = students.get(typedKey);

                System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                + "Current Average: %.2f",
                        currentStudent.getName(),
                        typedKey,
                        currentStudent.getGradeAverage()
                ));
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
            }
            System.out.println("Would you like to see another student?");
        } while(Input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");

    }
}
