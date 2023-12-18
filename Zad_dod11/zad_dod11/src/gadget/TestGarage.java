package gadget;

import java.util.ArrayList;
import java.util.List;

import static gadget.Gadget.sortGadgets;

public class TestGarage {
    public static void main(String[] args) {
        List<Gadget> gadgetList = new ArrayList<>();

        gadgetList.add(new Gadget("Smartphone", 110, 799.99));
        gadgetList.add(new Gadget("Laptop", 120, 2100.45));
        gadgetList.add(new Gadget("Smartwatch", 30, 200.00));

        sortGadgets(gadgetList);

        for (Gadget gadget : gadgetList) {
            System.out.println("Type: " + gadget.type + ", Battery Life: " + gadget.batteryLife + ", Price: $" + gadget.price);
        }
    }
}
