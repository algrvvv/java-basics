package practice.ds.hard.first;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = OrderManagement.createOrder();
        order.addProduct("Apple", 3000);
        order.addProduct("Pineapple", 5000);
        order.addProduct("Orange", 2500);

        order.printOrder();
        order.removeProduct("Pineapple");
        order.printOrder();

        Integer totalPrice = order.getTotalPrice();
        System.out.println(totalPrice);

        OrderManagement.storeOrder(order);

        // получение всех заказов
        List<Order> orders = OrderManagement.getOrders();
        for (Order o : orders) {
            o.printOrder();
        }
    }
}
