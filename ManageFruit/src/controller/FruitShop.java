/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Fruit;
import model.Order;

/**
 *
 * @author DELL
 */
public class FruitShop {

    private List<Fruit> fruits = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void run() {
        addFruits();
        showFruits();
        //shopping();
        //viewOrder();
    }

    private void addFruits() {
        fruits.add(new Fruit("01", "apple", 20.0, 100, "VietNam"));
        fruits.add(new Fruit("02", "orange", 10.0, 100, "VietNam"));
        fruits.add(new Fruit("03", "banana", 14.0, 100, "VietNam"));

    }

    private void showFruits() {
        System.out.printf("%-10s | %-40s | %-7s | %-12s | %-10s%n",
                "Item", "Name", "Price", "Quantity", "Origin");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (Fruit f : fruits) {
            System.out.printf("%-10s | %-40s | %-7.2f | %-12d | %-10s%n",
                    f.getFruit_id(),
                    f.getFruit_name(),
                    f.getFruit_price(),
                    f.getFruit_quantity(),
                    f.getFruit_origin());
        }
    }
}
