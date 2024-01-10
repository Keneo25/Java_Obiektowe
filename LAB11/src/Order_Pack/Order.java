package Order_Pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
    private int id;
    private String customerName;
    private LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {

        int dateComparison = order1.getOrderDate().compareTo(order2.getOrderDate());
        if (dateComparison == 0) {

            return Integer.compare(order1.getId(), order2.getId());
        } else {
            return dateComparison;
        }
    }
}

class TestOrder {
    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "CustomerA", LocalDate.of(2022, 1, 15)));
        orderList.add(new Order(2, "CustomerB", LocalDate.of(2022, 3, 5)));
        orderList.add(new Order(3, "CustomerC", LocalDate.of(2021, 12, 20)));
        orderList.add(new Order(4, "CustomerA", LocalDate.of(2022, 2, 8)));
        orderList.add(new Order(5, "CustomerB", LocalDate.of(2022, 1, 1)));


        Collections.sort(orderList, new OrderComparator());


        System.out.println("Posortowana lista zamówień:");
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
