/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bublesort;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class BubbleSort {

    private int[] array;

    public BubbleSort(int n) {
        this.array = new int[n];
    }

    public void addArray() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);
        }
    }

    public void Sort() {
        int size = array.length;
        boolean check = false;
        for (int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if(!check)
                break;
        }
    }

    public void disp() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
