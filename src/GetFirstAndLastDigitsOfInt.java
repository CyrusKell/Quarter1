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

public class GetFirstAndLastDigitsOfInt {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = in.nextInt();
        
        System.out.println("First digit of your integer is " + getFirstDigit(integer));
        System.out.println("Last digit of your integer is " + getLastDigit(integer));
    }
    
    public static int getFirstDigit(int integer) {
        if (integer < 0) {
            integer *= -1;
        }
        
        while (integer > 10) {
            integer /= 10;
        }
        
        return integer;
    }
    
    public static int getLastDigit(int integer) {
        if (integer < 0) {
            integer *= -1;
        }

        return integer % 10;
    }
}
