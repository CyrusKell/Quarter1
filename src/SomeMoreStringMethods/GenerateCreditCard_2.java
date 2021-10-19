/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomeMoreStringMethods;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class GenerateCreditCard_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        String card = in.nextLine();
        card = card.substring(card.length() - 6) + card.substring(0, card.length() - 6);
        System.out.println(card);
    }
}
