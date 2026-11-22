package com.hotdogshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий заказ покупателя.
 */
public class Order {
    private List<HotDog> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    /**
     * Добавить хот-дог в заказ.
     * @param hotDog Хот-дог
     */
    public void addHotDog(HotDog hotDog) {
        items.add(hotDog);
    }

    /**
     * Подсчитать стоимость текущего заказа.
     * @return Сумма заказа
     */
    public double getTotalPrice() {
        return items.stream().mapToDouble(HotDog::getPrice).sum();
    }

    public List<HotDog> getItems() {
        return items;
    }
}