/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class RandomNums_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of random numbers");
        randomNums(in.nextInt());
    }
    
    public static void randomNums(int n) {
        for (int i = 1; i <= n; i++) {
            int random = (int)(Math.random() * 41 + 10);
            System.out.print(random + " is ");
            if (!isPrime(random)) System.out.print("not ");
            System.out.println("prime");
        }
    }
    
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        
        return isPrime;
    }
}
