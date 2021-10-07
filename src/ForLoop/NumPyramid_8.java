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

public class NumPyramid_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int lines = in.nextInt();
        int spaceNeeded = 2 * Integer.toString(lines * 2 -1).length() - 1;
        
        for (int base = 1; base <= lines * 2; base += 2) {
            for (int space = 1; space <= (lines * 2 - base) / 2; space++) {
                for (int i = 1; i <= spaceNeeded; i++) {
                    System.out.print(" ");
                }
            }
            for (int i = base / 2 + 1; i < base; i++) {
                for (int space = 1; space <= spaceNeeded - Integer.toString(i).length(); space++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            for (int i = base; i > base / 2; i--) {
                for (int space = 1; space <= spaceNeeded - Integer.toString(i).length(); space++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
