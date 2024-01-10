package Converter_Pack;

public class ConverterTest {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        double amountInUSD = 30;
        System.out.println("Convert with USD to EURO" + currencyConverter.convertToEuro(amountInUSD));
        double amountInEURO = 60;
        System.out.println("Convert with EURO to USD" + currencyConverter.convertToUSD(amountInEURO));


        UnitConverter unitConverter = new UnitConverter();
        double amountInKM = 100;
        System.out.println("Convert with KM to MILE" + unitConverter.convertToEuro(amountInKM));
        double amountMile = 200;
        System.out.println("Convert with MILE to KM" + unitConverter.convertToUSD(amountMile));


    }
}
