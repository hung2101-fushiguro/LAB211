/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searcharr;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linearSearch search = new linearSearch(10);
        search.addArray();
        search.dispArray();
        int found = search.findElement(19);
        if(found >= 0){
            System.out.println(" Number 19 at index " + found);
        }
        else System.out.println(" not found ");
    }
    
}
