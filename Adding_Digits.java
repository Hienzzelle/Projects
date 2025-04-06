/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adding_digits;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Adding_Digits {

    public static void main(String[] args) {
        Scanner newin = new Scanner(System.in);
        
        System.out.println("Enter desired integer: ");
        int arrnum = newin.nextInt();
        
        String numStr = String.valueOf(arrnum);
        
            int [] digits = new int [numStr.length()];
        
                int sum = 0;
                for (int x = 0; x < numStr.length(); x++){
                    digits[x] = arrnum % 10;
                    sum += digits[x];
                    arrnum/=10;
            }
        System.out.println(sum);
    }
}
