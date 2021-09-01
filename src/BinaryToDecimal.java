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
        String binary = in.nextLine();
        
        System.out.println("Result:" + convertBinaryToDec(binary));
    }
    
    public static long convertBinaryToDec(String binary) {
        long decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (Integer.parseInt(binary.charAt(i) + "") * Math.pow(2, power));
            power++;
        }

        return decimal;
    }
}
