/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArrays;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class CustomNamesArray_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a = new String[4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a name:");
            a[i] = in.nextLine();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
