/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simple_calculator;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class SIMPLE_CALCULATOR {

    public static void main(String[] args) {
//greetings
        System.out.println("C A L C U L A T O R");
        
        
        Scanner myScan = new Scanner (System.in);
        //inputs
        
        System.out.println("Enter your first number:" );
        int num1 = myScan.nextInt();
        
        System.out.println("Enter your second number:" );
        int num2 = myScan.nextInt();
        
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = myScan.next().charAt(0);
        
        switch (operator){
            case '+':
                System.out.print(num1 + num2);
            break;
            
            case '-':
                System.out.print(num1 - num2); 
            break;
            
            case '*':
                System.out.print(num1 * num2);
            break;
            
            case '/':
                System.out.print(num1 / num2);
            break;
            default:
                System.out.print("ERROR");
                System.out.print("Choose a correct operator");
        }
    }
}
