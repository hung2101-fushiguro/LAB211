/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Order {
    private int order_id;
    private String customerName;
    private List<OrderDetail> items = new ArrayList<>();
    private double total;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addDetail(OrderDetail od) {
        items.add(od);
        total += od.getAmount();
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderDetail> getDetails() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<OrderDetail> getItems() {
        return items;
    }

    public void setItems(List<OrderDetail> items) {
        this.items = items;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Product       | Quantity | Price  | Amount\n");
        int i = 1;
        for (OrderDetail od : items) {
            sb.append(i++).append(". ").append(od.toString()).append("\n");
        }
        sb.append("Total: ").append(String.format("%.2f$", total)).append("\n");
        return sb.toString();
    }
}
