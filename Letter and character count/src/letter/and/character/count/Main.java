/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letter.and.character.count;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content:");
        String content = sc.nextLine();
        LetterAndCharacterCount count = new LetterAndCharacterCount(content);
        count.countWords();
        count.countChr();
        count.disp();
    }
}
