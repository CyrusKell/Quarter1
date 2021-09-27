/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

/**
 *
 * @author jayke
 */
import java.util.Scanner;

public class ConvertCents {
    public static int cents;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter money value in cents");
        cents = in.nextInt();
        
        while (cents != -1) {
            System.out.println(
                    countCoinsNeeded(100) + " dollars "
                    + countCoinsNeeded(25) + " quarters "
                    + countCoinsNeeded(10) + " dimes "
                    + countCoinsNeeded(5) + " nickels "
                    + countCoinsNeeded(1) + " pennies"
            );
            
            cents = in.nextInt();
        }
    }
    
    public static int countCoinsNeeded(double coinValue) {
        int numOfCoins = (int)(cents / coinValue);
        cents %= coinValue; 
        return numOfCoins;
    }
}
