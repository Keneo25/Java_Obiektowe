package org.class1.zad22;

public class TestGradeBook {
    public static void main(String[] args) {
        Gradebook studentGradebook = new Gradebook("Adam", "Nnowak");

        studentGradebook.addGrade(6);
        studentGradebook.addGrade(2);
        studentGradebook.addGrade(4);

        System.out.println("Student: " + studentGradebook.GetFirstName() + " " + studentGradebook.GetFirstName());
        System.out.println("Grades: " + studentGradebook.getGrades());

        double average = studentGradebook.averageGrade();
        System.out.println("Average Grade: " + average);

        studentGradebook.removeGrade(1); // Remove the second grade

        System.out.println("Updated Grades: " + studentGradebook.getGrades());
        average = studentGradebook.averageGrade();
        System.out.println("Updated Average Grade: " + average);
    }

}
