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
public class ArrayOfPrices_4 {
    public static void main(String[] args) {
        double[] prices = {1.25,2.65,8.45,3.56,2.87,7.89,8.34,98.5,9.32,23.02};
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            sum += prices[i];
        }
        System.out.println("Sum " + sum);
        System.out.println("Average " + sum/prices.length);
    }
}
