package VATCalculator_Pack;

public interface VATCalculator {
    public static double vatRate = 0.23;

    static double calculateWithVAT(double price){
        double vat_price = price * vatRate;
        return price + vat_price;
    }
}
