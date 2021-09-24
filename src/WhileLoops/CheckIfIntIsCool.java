/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

/**
 *
 * @author jayke
 */
import java.util.Scanner;

public class CheckIfIntIsCool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int integer = in.nextInt();
        final int savedInteger = integer;
        
        int numOfDigits = 0;
        int sumOfDigits = 0;
        while (integer > 0) {
            sumOfDigits += integer % 10;
            integer /= 10;
            numOfDigits++;
        }
        
        System.out.println(savedInteger + " has " + numOfDigits + " digits");
        if (savedInteger % sumOfDigits == 0) {
            System.out.println(savedInteger + " is a cool number");
        } else {
            System.out.println(savedInteger + " is not a cool number");
        }
        
    }
}
