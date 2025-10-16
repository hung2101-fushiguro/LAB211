/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;

import model.Fruit;

/**
 *
 * @author DELL
 */
public class FruitDao implements IFruitDao {

    private static final String ADD_FRUIT = "INSERT INTO Fruit(fruit_id, fruit_name, fruit_price, fruit_quantity, fruit_origin) VALUES (?, ?, ?, ?, ?)";
    private static final String SHOW_FRUIT = "SELECT * FROM Fruit";

    @Override
    public void addFruit(Fruit fruit) throws SQLException {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(ADD_FRUIT);
            ps.setString(1, fruit.getFruit_id());
            ps.setString(2, fruit.getFruit_name());
            ps.setDouble(3, fruit.getFruit_price());
            ps.setInt(4, fruit.getFruit_quantity());
            ps.setString(5, fruit.getFruit_origin());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Fruit> getAllFruits() {
        List<Fruit> fruits = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SHOW_FRUIT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Fruit fruit = new Fruit();
                fruit.setFruit_id(rs.getString("fruit_id"));
                fruit.setFruit_name(rs.getString("fruit_name"));
                fruit.setFruit_price(rs.getDouble("fruit_price"));
                fruit.setFruit_quantity(rs.getInt("fruit_quantity"));
                fruit.setFruit_origin(rs.getString("fruit_origin"));
                fruits.add(fruit);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruits;
    }

}
