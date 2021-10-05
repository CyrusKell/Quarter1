/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoop;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class CheckIfPrime_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a postive integer:");
        int n = in.nextInt();
        
        boolean prime = true;
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) prime = false;
        }
        
        System.out.print("Your number is ");
        if (!prime) System.out.print("not ");
        System.out.println("a prime number");
    }
}
