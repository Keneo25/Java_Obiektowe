package pl.travel.akt;

import jdk.jfr.Frequency;

public class Vacation {
    private String location;


    double cost;


    public Vacation(String location, double cost) {


        this.location = location;
        if(cost >= 0){
            this.cost = cost;
        }
        else{
            this.cost = 15.50;
        }

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0){
            this.cost = cost;
        }
    }

    public void showInformation() {
        System.out.println(location + " " + cost);
    }
}
