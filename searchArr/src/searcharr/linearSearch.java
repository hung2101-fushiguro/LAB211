/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searcharr;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class linearSearch {
   private int[] array;

    public linearSearch(int n) {
        this.array = new int[n];
    }
    public void addArray(){
        Random rd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(100);
        }
    }
    public void dispArray(){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public int findElement(int x){
        for (int i = 0; i < array.length; i++){
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    }
}
