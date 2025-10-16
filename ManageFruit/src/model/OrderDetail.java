/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class OrderDetail {

    private Fruit fruit;
    private int quantity;
    private double amount;

    public OrderDetail(Fruit fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.amount = fruit.getFruit_price() * quantity;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %8d | %5.2f$ | %5.2f$", fruit.getFruit_name(), quantity, fruit.getFruit_price(), amount);
    }
}
