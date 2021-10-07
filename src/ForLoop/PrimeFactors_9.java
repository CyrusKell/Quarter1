/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

/**
 *
 * @author cyrus
 */
import java.util.Scanner;

public class PrimeFactors_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = in.nextInt();
        
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
