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

public class CountDigitsOfInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = in.nextInt();
        
        System.out.println("Your integer has " + countDigitsWithWhile(integer) + " digits");
        System.out.println("Your integer has " + countDigitsWithoutWhile(integer) + " digits");
    }
    
    public static int countDigitsWithWhile(int integer) {
        int numOfDigits = 0;
        
        if (integer == 0) {
            numOfDigits = 1;
        } 
        if (integer < 0) {
            integer *= -1;
        }
        
        while (integer > 0) {
            numOfDigits++;
            integer /= 10;
        }
        
        
        return numOfDigits;
    }
    
    public static int countDigitsWithoutWhile(int integer) {
        if (integer < 0) {
            integer *= -1;
        }
        
        String integerAsStr = String.valueOf(integer);
        
        return integerAsStr.length();
    }
    
}
