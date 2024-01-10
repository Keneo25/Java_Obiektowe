package Car_pack;

public class Test_Car {
    public static void main(String[] args) {
        Car car1 = new Car("Mecedes" , "c63", 14.5);
        double fuelPice = 7.18;
        double distance = 200;

        double trravelCost = car1.fuelCost(fuelPice,distance);
        System.out.println(trravelCost);

    }
}
