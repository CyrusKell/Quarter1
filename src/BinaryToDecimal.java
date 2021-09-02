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

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a binary number to be converted to decimal:");
        long binary = in.nextLong();
        validateBinary(binary);
        
        System.out.println("Result:" + convertBinaryToDec(binary));
    }
    
    public static void validateBinary(long binary) {
        while (binary > 0) {
            if (binary % 10 != 0 && binary % 10 != 1) {
                System.out.println("Entered value is not valid binary");
                System.exit(0);
            }
            binary /= 10;
        }
    }
    
    public static long convertBinaryToDec(long binary) {
        long decimal = 0;
        int power = 0;
        
        while (binary > 0) {
            decimal += binary % 10 * Math.pow(2, power++);
            binary /= 10;
        }

        return decimal;
    }
}
