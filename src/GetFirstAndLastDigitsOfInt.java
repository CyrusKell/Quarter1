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
        
        String integerAsStr = String.valueOf(integer);
        
        System.out.println("First digit of your integer is " + integerAsStr.charAt(0));
        System.out.println("Last digit of your integer is " + integerAsStr.charAt(integerAsStr.length() - 1));
    }
}
