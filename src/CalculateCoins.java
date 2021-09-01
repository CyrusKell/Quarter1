/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class CalculateCoins {
    public static double dollars;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dollar amount to be converted to coins:");
        dollars = in.nextDouble();
        
        System.out.println(
            "You need " 
            + countCoinsNeeded(.25) + " quarters, " 
            + countCoinsNeeded(.10) + " dimes, " 
            + countCoinsNeeded(.05) + " nickels, and " 
            + countCoinsNeeded(.01) + " pennies"
        );
    }
    
    public static int countCoinsNeeded(double coinValue) {
        int numOfCoins = (int)(dollars / coinValue);
        
        dollars = dollars % coinValue; 
        dollars = (double)Math.round(dollars * 100) / 100;
        
        return numOfCoins;
    }
}
