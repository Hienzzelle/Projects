/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Palindrome {

    public static void main(String[] args) {
        
        int count = 0; 
        int x, j;
        Scanner newinput = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = newinput.nextLine().toLowerCase(); 
        int wordsize = word1.length();
        char[] arrWord = new char[wordsize]; 
        char[] arrWordrev = new char[wordsize];

        for (int i = 0; i < arrWord.length; i++) {
            arrWord[i] = word1.charAt(i);
        }

        for (j = 0, x = arrWord.length - 1; x >= 0; x--, j++) {
            arrWordrev[x] = arrWord[j];
        }

        for (int y = 0; y < arrWord.length; y++) {
            if (arrWordrev[y] != arrWord[y]) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The word " + word1 + " is not a palindrome.");
        } else if (count == 0) {
            System.out.println("The word " + word1 + " is a palindrome.");
        }
    }
}
