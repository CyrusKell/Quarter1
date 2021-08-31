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

public class BuyStamps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of money you have to spend:");
        double money = in.nextDouble();
        
        double pricePerStamp = 0.47;
        
        int numOfStamps  = (int)(money / pricePerStamp);
        
        System.out.println("You can buy " + numOfStamps + " first class stamps");
    }
}
