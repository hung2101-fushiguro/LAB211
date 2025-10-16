/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package managefruit;

import controller.FruitShop;
import dao.FruitDao;
import model.Fruit;
import model.OrderDetail;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ManageFruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method mt = new Method();
        while(true){
            System.out.println("\n----------Fruit shop----------");
            System.out.println("1.View product in shop");
            System.out.println("1.View product in shop");
            System.out.println("1.View product in shop");
            System.out.println("1.View product in shop");
            System.out.println("Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                   mt.viewFruit();
                }
                break;
                case 2:{
                    System.out.println("Enter the Id:");
                    String fruitId = sc.nextLine();
                    System.out.println("Enter name:");
                    String fruitName = sc.nextLine();
                    System.out.println("Enter price:");
                    Double fruitPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter quantity:");
                    int fruitQuantity = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter origin:");
                    String fruitOrigin = sc.nextLine();
                    mt.addnewFruit(fruitId, fruitName, fruitPrice, fruitQuantity, fruitOrigin);
                }
            }
        }
    }

}
