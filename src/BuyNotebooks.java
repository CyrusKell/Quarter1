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
import java.text.DecimalFormat;

public class BuyNotebooks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of notebooks purchased:");
        int notebooks = in.nextInt();
        System.out.println("Enter price of each notebook:");
        double price = in.nextDouble();
        in.nextLine();
        System.out.println("Enter career of purchaser:");
        String career = in.nextLine();
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        double tax = 1.06;
        double taxDue = tax * price;
        double total = notebooks * price + taxDue;
        
        System.out.println("");
        System.out.println(career + " - tax: $" + df.format(taxDue) + " total: $" + df.format(total));
    }
    
  
}
