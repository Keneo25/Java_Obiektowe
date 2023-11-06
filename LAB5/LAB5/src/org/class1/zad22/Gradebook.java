package org.class1.zad22;

public class Gradebook {
    private String firstName;
    private String lastName;
    int[] grades = {4,6,8,2,1};


    public Gradebook(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;

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


    public void addGrade(int grade){
        this.grades = grades;
    }


    public void removeGrade(int index){

    }


}
