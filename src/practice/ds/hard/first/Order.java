package practice.ds.hard.first;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<String, Integer> products = new HashMap<>();

    /**
     * Добавить продукт в заказ
     *
     * @param name название продукта
     * @param price цена продукта
     */
    public void addProduct(String name, int price) {
        products.put(name, price);
    }

    /**
     * Удаление продукта из заказа
     *
     * @param name название продукта
     */
    public void removeProduct(String name) {
        products.remove(name);
    }

    /**
     * Подсчет суммы всего заказа
     *
     * @return общая стоимость
     */
    public Integer getTotalPrice() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            total += entry.getValue();
        }

        return total;
    }

    /**
     * Вывод всего заказа
     */
    public void printOrder() {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
    }

}
