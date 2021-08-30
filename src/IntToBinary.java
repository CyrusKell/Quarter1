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

public class IntToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer to be converted to binary:");
        int integer = in.nextInt();
        
        System.out.println("Result: " + convertIntToBinaryString(integer));
    }
    
    public static String convertIntToBinaryString(int integer) {
        String binary = "";
        while (integer > 0) {
            binary = integer % 2 + binary;
            integer /= 2;
        }
        
        return binary;
    }
}
