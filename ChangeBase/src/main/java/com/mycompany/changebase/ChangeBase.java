/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.changebase;

/**
 *
 * @author DELL
 */
public class ChangeBase {
    private int[] digits; // mảng lưu số dư khi đổi

    public ChangeBase(int size) {
        this.digits = new int[size];
    }

    
    public String decToHex(int n) {
        if (n == 0) return "0";
        int i = 0;
        while (n != 0) {
            digits[i] = n % 16;
            n = n / 16;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = i - 1; j >= 0; j--) {
            if (digits[j] > 9) {
                sb.append((char) (55 + digits[j])); 
            } else {
                sb.append(digits[j]);
            }
        }
        return sb.toString();
    }

    
    public int hexToDec(String hex) {
        int base = 1;
        int decVal = 0;
        hex = hex.toUpperCase();

        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            if (c >= '0' && c <= '9') {
                decVal += (c - '0') * base;
            } else if (c >= 'A' && c <= 'F') {
                decVal += (c - 'A' + 10) * base;
            } else {
                throw new IllegalArgumentException("Invalid hex digit: " + c);
            }
            base *= 16;
        }
        return decVal;
    }

    
    public String decToBin(int n) {
        if (n == 0) return "0";
        int i = 0;
        while (n != 0) {
            digits[i] = n % 2;
            n = n / 2;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = i - 1; j >= 0; j--) {
            sb.append(digits[j]);
        }
        return sb.toString();
    }

    
    public int binToDec(String bin) {
        int base = 1;
        int decVal = 0;

        for (int i = bin.length() - 1; i >= 0; i--) {
            char c = bin.charAt(i);
            if (c == '1') {
                decVal += base;
            } else if (c != '0') {
                throw new IllegalArgumentException("Invalid binary digit: " + c);
            }
            base *= 2;
        }
        return decVal;
    }
}

