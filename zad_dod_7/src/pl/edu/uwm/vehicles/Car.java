package pl.edu.uwm.vehicles;

import java.util.Objects;

public class Car {
    private String model;
    private int yearOfManufacture;
    private double mileage;

    public Car(String model, int yearOfManufacture, double mileage){
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
    }

    @Override
    public String toString(){
        if(model == null || model.equals("")){
            return String.format("Rok produkcji %d przebieg %f", yearOfManufacture, mileage);
        }
        return String.format("Model %s  Rok produkcji %d przebieg %f",model, yearOfManufacture, mileage);
    }




}
