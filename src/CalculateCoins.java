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
        
        int[] coinsNeeded = {0, 0, 0, 0};
        
        coinsNeeded[0] = countCoinsNeeded(.25);
        coinsNeeded[1] = countCoinsNeeded(.10);
        coinsNeeded[2] = countCoinsNeeded(.05);
        coinsNeeded[3] = countCoinsNeeded(.01);
        
        System.out.println(
                "You need " + coinsNeeded[0] + " quarters, " 
                + coinsNeeded[1] + " dimes, " 
                + coinsNeeded[2] + " nickels, and " 
                + coinsNeeded[3] + " pennies");
    }
    
    public static int countCoinsNeeded(double coinValue) {
        int numOfCoins = (int)(dollars / coinValue);
        
        dollars -= numOfCoins * coinValue;
        dollars = (double)Math.round(dollars * 100) / 100;
        
        return numOfCoins;
    }
}
