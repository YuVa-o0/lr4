package com.hotdogshop;

/**
 * Абстрактный класс, представляющий хот-дог.
 */
public abstract class HotDog {
    private String name;
    private double price;

    /**
     * Конструктор базового класса.
     * @param name Название хот-дога
     * @param price Цена
     */
    public HotDog(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + price + " руб.)";
    }
}