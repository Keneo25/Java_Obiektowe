package pl.cars.zad12;

public class Car {
    private String brand;
    private String model;
    int productionYear;
    int mileage;
    private String color;

    public Car(String brand, String model, int productionYear,int mileage, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;

    }

    public String GetBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String GetModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int GetProductionYear(){
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int GetMileage(){
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String GetColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInformation(){
        System.out.println(brand+ " " + model+ " " + productionYear+ " " + mileage + " " + color);
    }






}
