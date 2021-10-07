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

public class FibonacciSequence_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = in.nextInt();
        
        int twoBefore = 1;
        int oneBefore = 0;
        for (int i = 1; i <= n; i++) {
            int current = twoBefore + oneBefore;
            System.out.print(current + ", ");
            twoBefore = oneBefore;
            oneBefore = current;
        }
    }
}
