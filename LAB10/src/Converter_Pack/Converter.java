package Converter_Pack;

public interface Converter {

    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);

    abstract double getConversionRate(String currency);

}

class CurrencyConverter implements Converter {
    private static final double EUR_TO_USD = 0.91;
    private static final double USD_TO_EURO = 1.10;

    @Override
    public double convertToEuro(double amount) {
        return amount * getConversionRate("USD");
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * getConversionRate("EURO");
    }

    @Override
    public double getConversionRate(String currency) {
        if("USD".equalsIgnoreCase(currency)){
            return EUR_TO_USD;
        }
        else if ("EURO".equalsIgnoreCase(currency)){
            return USD_TO_EURO;
        } else {
            return 1.0;

        }
    }
}

class UnitConverter implements Converter{
    private static final double KM_TO_MILE = 0.62;
    private static  final double MILE_TO_KM = 1.6;
    @Override
    public double convertToEuro(double amount) {
        return amount * getConversionRate("MILE");
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * getConversionRate("KM");
    }

    @Override
    public double getConversionRate(String currency) {
        if("MILE".equalsIgnoreCase(currency)){
            return KM_TO_MILE;
        }
        else if("KM".equalsIgnoreCase(currency)){
            return MILE_TO_KM;
        }
        else{
            return 1.0;
        }
    }
}
