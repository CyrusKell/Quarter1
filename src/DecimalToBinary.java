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

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer greater than 0 to be converted to binary:");
        long decimal = in.nextLong();
        
        if (decimal < 0) {
            System.out.println("Error: integer must be greater than 0");
            System.exit(0);
        }
        
        System.out.println("Result: " + convertIntToBinaryString(decimal));
    }
    
    public static String convertIntToBinaryString(long decimal) {
        String binary = "";
        
        if (decimal > 0) {
            while (decimal > 0) {
            binary = decimal % 2 + binary;
            decimal /= 2;
            }
        } else {
            binary = "0";
        }
        
        return binary;
    }
}
