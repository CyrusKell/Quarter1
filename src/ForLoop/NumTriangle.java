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

public class NumTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int lines = in.nextInt();
        
        for (int base = 1; base <= lines * 2; base += 2) {
            int additionalSpaces = (lines * 2 - base);
            for (int space = 1; space <= (lines * 2 - base + additionalSpaces) / 2; space++) {
                System.out.print(" ");
            }
            for (int i = base / 2 + 1; i < base; i++) {
                System.out.print(i);
            }
            for (int i = base; i > base / 2; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
