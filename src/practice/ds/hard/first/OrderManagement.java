package practice.ds.hard.first;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement {
    private static final List<Order> orders = new ArrayList<>();

    /**
     * Создать заказ
     *
     * @return пустой заказ
     */
    public static Order createOrder() {
        return new Order();
    }

    /**
     * Добавить заказ в список
     *
     * @param order заказ
     */
    public static void storeOrder(Order order) {
        orders.add(order);
    }

    /**
     * Получение списка заказов
     *
     * @return список заказов
     */
    public static List<Order> getOrders() {
        return orders;
    }
}
