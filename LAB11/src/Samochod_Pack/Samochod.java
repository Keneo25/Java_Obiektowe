package Samochod_Pack;

import java.util.Arrays;
import java.util.Comparator;

public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", cena=" + cena +
                '}';
    }
}
 class RokProdukcjiComp implements Comparator<Samochod>{

     @Override
     public int compare(Samochod o1, Samochod o2) {
         return Integer.compare(o1.getRokProdukcji(), o2.getRokProdukcji());
     }
 }

 class SamochodTest{
    public static void main(String[] args) {
        Samochod[] samochody = {
                new Samochod("Mercedes",2002,3.5),
                new Samochod("Audi", 2012, 2.4),
                new Samochod("Mazda", 2020,345.2),
                new Samochod("BMW", 2019,9.6)
        };
       Arrays.sort(samochody, new RokProdukcjiComp());

       for(Samochod samochod : samochody){
           System.out.println(samochod);
       }
    }
}

