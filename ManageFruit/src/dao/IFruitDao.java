/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.Fruit;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IFruitDao {

    void addFruit(Fruit fruit) throws SQLException;

    List<Fruit> getAllFruits();

    Fruit getFruitById(String fruitId);

    void updateQuantity(String fruitId, int quantityUd) throws SQLException;
}
