package exercise_3;

import java.util.Arrays;

public class ECommercePlatform {

    public static void main(String[] args) {
        // Sample orders for Testing Purpose
        Order[] orders = {
            new Order(1, "Aman", 134.91),
            new Order(2, "Aryan", 132.65),
            new Order(3, "Vaibhav", 193.40),
            new Order(4, "Bella", 293.54),
            new Order(5, "Agman", 176.13)
        };

        System.out.println("Bubble Sort:");
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        System.out.println("\nQuick Sort:");
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
