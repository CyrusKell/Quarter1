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
        
        int lastDigit = integer % 10;
        
        while (integer > 10) {
            integer /= 10;
        }
        
        System.out.println("First digit of your integer is " + integer);
        System.out.println("Last digit of your integer is " + lastDigit);
    }
}
