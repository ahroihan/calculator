/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Ahroi
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, optS ,res = 0;
        System.out.println("PROGRAM JAVA CALCULATOR WITH CLI");
        System.out.println("1. Penjumlahan - Add (+)");
        System.out.println("2. Pengurangan - Sub (-)");
        System.out.println("3. Perkalian - Mul (*)");
        System.out.println("4. Pembagian - Div (/)");
        System.out.println("----------------------------");
        System.out.print("Operator (enter): ");
        optS=input.nextInt();
        System.out.print("Num 1 (enter): ");
        num1=input.nextInt();
        System.out.print("Num 2 (enter): ");
        num2=input.nextInt();
                 
        switch (optS){
             case 1 -> res=num1+num2;
             case 2 -> res=num1-num2;
             case 3 -> res=num1*num2;
             case 4 -> res=num1/num2;
             default -> System.out.println("Option Error!");
        }         
        System.out.println("Result :"+res);
    }
    
}