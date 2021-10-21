/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArrays;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class ArrayOfPricesCustomLength_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of prices: ");
        int n = in.nextInt();
        double[] prices = new double[n];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter a price:");
            prices[i] = in.nextDouble();
        }
        
        double min = prices[0];
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        System.out.println("Lowest value is " + min + " at index of " + minIndex);
        
    }
}
