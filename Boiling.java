/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boiling;

import java.util.Scanner;
/**
 *
 * @author Carl
 */
public class Boiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Write a program that reads in a temperature value
        /in celcius and prints out if the water is boiling or at the specified temperture
        */
        System.out.println("Please enter the temperature: ");
        Scanner sc= new Scanner(System.in);
        int temp = sc.nextInt();
        int boilingtemp = 100;
        if (temp >= boilingtemp) {
            // Write what happends if the condition is true
            System.out.println("The water is boiling!!!");
            
        } else {
            System.out.println("The water is not boiling :c ");
    }
    }
    
}
