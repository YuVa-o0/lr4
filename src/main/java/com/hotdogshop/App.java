package com.hotdogshop;

/**
 * Главный класс для демонстрации работы приложения.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Система учета хот-догов ===");

        ShopManager manager = new ShopManager();

        // Создаем первый заказ
        Order order1 = new Order();
        order1.addHotDog(new HunterDog());
        order1.addHotDog(new Berlin());
        
        // Создаем второй заказ
        Order order2 = new Order();
        order2.addHotDog(new MasterDog());
        order2.addHotDog(new MasterDog());
        order2.addHotDog(new HunterDog());

        manager.addOrder(order1);
        manager.addOrder(order2);

        // Вывод результатов
        System.out.println("Список заказов:");
        for (int i = 0; i < manager.getOrderCount(); i++) {
            // Для простоты доступа используем геттер из менеджера (нужно добавить в класс ShopManager)
            // Или просто выводим сумму, если список приватный
        }

        System.out.println("\nСтатистика:");
        System.out.printf("Общая сумма всех заказов: %.2f руб.%n", manager.getTotalRevenue());
        System.out.println("Количество полных заказов: " + manager.getOrderCount());
        System.out.printf("Средняя стоимость заказа: %.2f руб.%n", manager.getAverageOrderValue());
    }
}