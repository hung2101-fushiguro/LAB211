/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managefruit;

import dao.FruitDao;
import java.util.List;
import model.Fruit;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Method {

    public void viewFruit() {
        FruitDao frd = new FruitDao();
        try {
            List<Fruit> fr = frd.getAllFruits();
            if (fr != null && !fr.isEmpty()) {
                System.out.printf("%-15s | %-40s | %-10s | %-7s | %-20s%n",
                        "Fruit ID", "Name", "Price", "Quantity", "Origin");
                System.out.println("----------------------------------------------------------------------------------------------");
                for (Fruit f : fr) {
                    System.out.printf("%-15s | %-40s | %-10s | %-7s | %-20s%n",
                            f.getFruit_id(),
                            f.getFruit_name(),
                            f.getFruit_price(),
                            f.getFruit_quantity(),
                            f.getFruit_origin());
                }
            } else {
                System.out.println("List is empty");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addnewFruit(String fruitId, String fruitName, double fruitPrice, int fruitQuantity, String fruitOrigin) {
        FruitDao frd = new FruitDao();

        Fruit fr = new Fruit(fruitId, fruitName, fruitPrice, fruitQuantity, fruitOrigin);
        try {
            frd.addFruit(fr);
            System.out.println("Add successfully!");
        }catch(Exception e){
            System.out.println("Add failed!");
            e.printStackTrace();
        }
    }
}
