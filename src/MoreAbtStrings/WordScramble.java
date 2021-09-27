/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreAbtStrings;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class WordScramble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = in.nextLine();
        System.out.println("Enter second string:");
        String str2 = in.nextLine();
        
        while (!str1.equals("stop") && !str2.equals("stop")) {
            String str1half = str1.substring(0, str1.length() / 2);
            String str2half = str2.substring(str2.length() / 2);
            
            System.out.println(str1half + str2half);
            if (str1half.length() > str2half.length()) {
                System.out.println("Longer half: " + str1half);
            } else {
                System.out.println("Longer half: " + str2half);
            }
            
            System.out.println("Enter first string:");
            str1 = in.nextLine();
            if (str1.equalsIgnoreCase("stop")) {System.exit(0);}
            System.out.println("Enter second string:");
            str2 = in.nextLine();
        }
    }
}
