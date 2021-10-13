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

public class TableOfSquaresAndCubes_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 20:");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));

        }
    }
}
