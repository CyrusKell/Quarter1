/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArraysPart2;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class Izzle_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = in.nextLine();
        String[] sArray = s.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = sArray[i].toUpperCase() + "izzle";
        }
        for (String word : sArray) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
