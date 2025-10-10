/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letter.and.character.count;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class LetterAndCharacterCount {

    private String content;

    public LetterAndCharacterCount(String content) {
        this.content = content;
    }

    public Map<String, Integer> countWords() {
        StringTokenizer str = new StringTokenizer(content);
        Map<String, Integer> count = new HashMap<>();
        while (str.hasMoreTokens()) {
            String word = str.nextToken();
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        return count;
    }

    public Map<Character, Integer> countChr() {
        Map<Character, Integer> chrCount = new HashMap<>();
        for (char chr : content.toCharArray()) {
            if (Character.isLetter(chr)) {
                chrCount.put(chr, chrCount.getOrDefault(chr, 0) + 1);
            }
        }
        return chrCount;
    }

    public void disp() {
        Map<String, Integer> wordCount = countWords();
        Map<Character, Integer> chrCount = countChr();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry<Character, Integer> entry : chrCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
