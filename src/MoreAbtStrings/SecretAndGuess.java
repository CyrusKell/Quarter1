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

public class SecretAndGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter secret string:");
        String secret = in.nextLine();
        System.out.println("Enter guess string:");
        String guess = in.nextLine();
        
        int count = 0;
        while (secret.contains(guess)) {
            secret = secret.substring(secret.indexOf(guess) + guess.length());
            count++;
        }
        
        System.out.println(count * guess.length() * guess.length());
    }
}
