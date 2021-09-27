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

public class ReplaceTheWithA {
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = in.nextLine();
        
        int i = sentence.indexOf("the");
        while (i != -1) {
            sentence = sentence.substring(0, i) + "A" + sentence.substring(i + "the".length());
            i = sentence.indexOf("the");
        }
        
        System.out.println(sentence);
    }
}
