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

public class Read2Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = in.nextLine();
        System.out.println("Enter second string:");
        String str2 = in.nextLine();
        
        System.out.println(str1.indexOf(str2));
        System.out.println(str1.substring(0,3));
        System.out.println(str1.substring(str1.length() - str2.length()));
        System.out.println(str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2));
        
        int count = 0;
        while (str1.contains(str2)) {
            str1 = str1.substring(str1.indexOf(str2) + str2.length());
            count++;
        }
        System.out.println(count);

//        System.out.println(str1.substring(str1.indexOf(str2) + str2.length()));
        
    }
    
}
