package com.hotdogshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для управления всеми заказами магазина.
 */
public class ShopManager {
    private List<Order> orders;

    public ShopManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    /** Задание 4: Подсчитать общую сумму всех заказов */
    public double getTotalRevenue() {
        return orders.stream().mapToDouble(Order::getTotalPrice).sum();
    }

    /** Задание 5: Подсчитать количество полных заказов */
    public int getOrderCount() {
        return orders.size();
    }

    /** Задание 6: Подсчитать среднюю стоимость заказов */
    public double getAverageOrderValue() {
        if (orders.isEmpty()) return 0;
        return getTotalRevenue() / getOrderCount();
    }
}