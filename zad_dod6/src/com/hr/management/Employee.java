package com.hr.management;

public class Employee {

    private int workHours;

    public Employee(int workHours ) {
        this.workHours = workHours;

        if(workHours >= 0 && workHours <=60){
            this.workHours = workHours;
        }
        else{
            this.workHours = 40;
        }

    }
    public int getworkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {

        if(workHours >= 0 && workHours <=60) {
            this.workHours = workHours;
        }
    }


    public void showInformation() {
        System.out.println(workHours);
    }




}
