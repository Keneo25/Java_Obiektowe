package Product_Pack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}


class PriceComp implements Comparator<Product>{


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() == o2.getPrice()){
            return Integer.compare(o1.getId(), o2.getId());
        }
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}



class PoductTest{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Telefon", 2000));
        products.add(new Product(4, "Laptop", 1000));
        products.add(new Product(3, "Koszulka", 20));
        products.add(new Product(2, "Monitor", 1000));
        products.add(new Product(5, "Perfum", 4000));

        Collections.sort(products, new PriceComp());

        for(Product product : products){
            System.out.println(product);
        }


    }

}
