/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Fruit {

    private String fruit_id;
    private String fruit_name;
    private double fruit_price;
    private int fruit_quantity;
    private String fruit_origin;

    public Fruit() {
    }

    public Fruit(String fruit_id, String fruit_name, double fruit_price, int fruit_quantity, String fruit_origin) {
        this.fruit_id = fruit_id;
        this.fruit_name = fruit_name;
        this.fruit_price = fruit_price;
        this.fruit_quantity = fruit_quantity;
        this.fruit_origin = fruit_origin;
    }

    public String getFruit_id() {
        return fruit_id;
    }

    public void setFruit_id(String fruit_id) {
        this.fruit_id = fruit_id;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public double getFruit_price() {
        return fruit_price;
    }

    public void setFruit_price(double fruit_price) {
        this.fruit_price = fruit_price;
    }

    public int getFruit_quantity() {
        return fruit_quantity;
    }

    public void setFruit_quantity(int fruit_quantity) {
        this.fruit_quantity = fruit_quantity;
    }

    public String getFruit_origin() {
        return fruit_origin;
    }

    public void setFruit_origin(String fruit_origin) {
        this.fruit_origin = fruit_origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruit_id=" + fruit_id + ", fruit_name=" + fruit_name + ", fruit_price=" + fruit_price + ", fruit_quantity=" + fruit_quantity + ", fruit_origin=" + fruit_origin + '}';
    }

}
