package Car_Pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", 70000, 2002));
        cars.add(new Car("BMW", 170000, 2012));
        cars.add(new Car("Renault", 30000, 2016));
        cars.add(new Car("Audi", 200000, 2020));

        Collections.sort(cars);

        System.out.println("Posortowana Lista");
        for(Car car:cars){
            System.out.println(car.brand + " Przebieg: "+car.getMileage());
        }

    }



}
