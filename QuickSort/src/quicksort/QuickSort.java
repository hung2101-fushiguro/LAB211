/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class QuickSort {

    private int[] array;

    public QuickSort(int n) {
        this.array = new int[n];
    }

    public void addArray() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);
        }
    }

    public void disp() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int partition(int low, int high) { // dung de chia mang thanh 2 phan xung quanh gia tri privot
        int privot = array[high]; // chon phan tu ngoai cung ben phai lam moc
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= privot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    public void Sort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            Sort(low, pi - 1);
            Sort(pi + 1, high);
        }
    }
}
