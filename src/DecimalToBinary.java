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
        int integer = in.nextInt();
        
        if (integer < 0) {
            System.out.println("Error: integer must be greater than 0");
            System.exit(0);
        }
        
        System.out.println("Result: " + convertIntToBinaryString(integer));
    }
    
    public static String convertIntToBinaryString(int integer) {
        String binary = "";
        
        if (integer > 0) {
            while (integer > 0) {
            binary = integer % 2 + binary;
            integer /= 2;
            }
        } else {
            binary = "0";
        }
        
        return binary;
    }
}
