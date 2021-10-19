/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomeMoreStringMethods;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class ReverseString_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = in.nextLine();
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            newString = newString + string.charAt(i);
        }
        System.out.println(newString);
    }
    
    
}
