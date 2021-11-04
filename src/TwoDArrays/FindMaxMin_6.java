/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArrays;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class FindMaxMin_6 {
    public static void findMaxMin(int[][] a) {
        int max = a[0][0];
        int min = a[0][0];
        for (int[] row : a) {
            for (int n : row) {
                if (n > max) max = n;
                if (n < min) min = n;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a.length; k++) {
                System.out.println("Enter an integer:");
                a[i][k] = in.nextInt();
            }
        }
        
        findMaxMin(a);
    }
}
