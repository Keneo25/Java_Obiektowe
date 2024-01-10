package Car_Pack;

public class Car implements Comparable<Car> {
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }


    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.mileage, o.mileage);
    }
}
