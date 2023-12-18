package gadget;

import java.util.Collections;
import java.util.List;

public class Gadget implements Comparable<Gadget> {
    String type;
    int batteryLife;
    double price;
    public Gadget(String type, int batteryLife, double price) {
        this.type = type;
        this.batteryLife = batteryLife;
        this.price = price;
    }
    @Override
    public int compareTo(Gadget o) {
        return Integer.compare(o.batteryLife, this.batteryLife);
    }
    public static void sortGadgets(List<Gadget> gadgets) {
        Collections.sort(gadgets);
    }
}
