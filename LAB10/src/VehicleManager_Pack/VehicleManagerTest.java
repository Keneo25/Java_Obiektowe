package VehicleManager_Pack;

public class VehicleManagerTest {
    public static void main(String[] args) {
      Car car = new Car();
      Motorrcycle motorrcycle = new Motorrcycle();

        System.out.println(car.startEngine());
        System.out.println(car.getFuelLevel());
        System.out.println(motorrcycle.startEngine());
        System.out.println(motorrcycle.getFuelLevel());

    }
}
