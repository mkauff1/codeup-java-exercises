package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        student1.addGrade(100);
        student1.addGrade(50);
        //System.out.println(student1.getGradeAverage());
    }

    private String studentNames;
    private ArrayList<Integer> studentGrades;

    public Student(String studentNames) {
        this.studentNames = studentNames;
        this.studentGrades = new ArrayList<>();
    }

//    public String getName(){
//        return;
//    }

    public void addGrade(int grade){

    }

//    public double getGradeAverage(){
//        return;
//    }

}
