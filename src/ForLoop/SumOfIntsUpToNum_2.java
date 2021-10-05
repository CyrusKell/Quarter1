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

public class SumOfIntsUpToNum_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = in.nextInt();
        int sum = 0;
        for (int i=0; i<=num; i++) {
            sum += i;
        }
        System.out.println(sum);    
    }
}
