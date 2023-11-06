package org.class1.zad22;
import java.util.ArrayList;
import java.util.List;


public class Gradebook {


    private String firstName;
    private String lastName;

    private ArrayList<Integer> grades;

    public Gradebook(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
        this.grades = new ArrayList<Integer>();
    }


    public String GetFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String GetLastName(){
        return lastName;
    }

    public void setLastNameName(String lastName) {
        this.lastName = lastName;
    }


    public List<Integer> getGrades() {
        return grades;
    }


    public void addGrade(int grade){
          grades.add(grade);
    }


    public void removeGrade(int index){
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
        }
    }

    public double averageGrade(){
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();

    }



}
