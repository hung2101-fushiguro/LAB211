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

    public OrderDetail() {
    }

    public OrderDetail(Fruit fruit, int quantity, double amount) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.amount = fruit.getFruit_price() * quantity;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OderDetail{" + "fruit=" + fruit + ", quantity=" + quantity + ", amount=" + amount + '}';
    }

}
