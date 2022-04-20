package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        student1.addGrade(50);
        student1.addGrade(100);
        student1.addGrade(0);
        System.out.println(student1.getGradeAverage());
    }

    private String studentNames;
    private ArrayList<Integer> studentGrades;

    public Student(String studentNames) {
        this.studentNames = studentNames;
        this.studentGrades = new ArrayList<>();
    }

    public String getName(){
        return studentNames;
    }

    public void addGrade(int grade){
        this.studentGrades.add(grade);
    }

    public double getGradeAverage(){
        int totalPoints = this.studentGrades.stream().reduce(0, (sum, currentGradeElement) -> {
            System.out.println("The sum is currently: " + sum);
            System.out.println("The current grade element is: " + currentGradeElement);
            System.out.println("**********************");
            return sum + currentGradeElement;
        });
        System.out.println(totalPoints);
        return (double) totalPoints / this.studentGrades.size();
//        double sum = 0;
//        for (double g : studentGrades) {
//            sum = sum + g;
//        }
//        double avg = 0;
//        if (studentGrades.size() > 0) {
//            avg = sum / studentGrades.size();
//        }
//        return avg;
    }

}
