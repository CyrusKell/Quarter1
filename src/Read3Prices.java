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

public class Read3Prices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first price:");
        double price1 = in.nextDouble();
        System.out.println("Enter second price:");
        double price2 = in.nextDouble();
        System.out.println("Enter third price:");
        double price3 = in.nextDouble();
        
        double total = price1 + price2 + price3;
        double averagePrice = total / 3;
        
        System.out.println("");
        System.out.printf("$%.2f", averagePrice);
        System.out.println("");
    }
}
