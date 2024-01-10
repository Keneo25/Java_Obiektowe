package VehicleManager_Pack;

public interface VehicleManager {
    abstract String startEngine();
    abstract int getFuelLevel();



}

class Car implements VehicleManager{

    @Override
    public String startEngine() {
       return "Silnik samochodu uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}

class Motorrcycle implements VehicleManager{

    @Override
    public String startEngine() {
        return "Silnik motocykla uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }


}
