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
        
        System.out.println("Result:" + convertBinaryToDec(binary));
    }
    
    public static long convertBinaryToDec(long binary) {
        long decimal = 0;
        String binaryAsStr = String.valueOf(binary);
        
        int power = 0;
        
        for (int i = binaryAsStr.length() - 1; i > 0; i--) {
            decimal += (binaryAsStr.charAt(i) * Math.pow(2, power));
            System.out.println(decimal + " : " + power);
            power++;
            System.out.println(binaryAsStr);
            binaryAsStr = binaryAsStr.substring(0, i - 1);
        }
            
        return decimal;
    }
}
