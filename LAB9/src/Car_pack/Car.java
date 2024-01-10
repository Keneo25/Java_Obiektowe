package Car_pack;

public record Car(String brand,String model, double fuelCosumptionPer100km){

   public double fuelCost(double fuelPrice, double distance){
        double fuelConsumed = (fuelCosumptionPer100km / 100) * distance;
        return fuelConsumed * fuelPrice;
    }
}
