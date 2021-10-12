/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author cyrus.kell
 */
public class Recombine_7 {
    public static String recombine(String word1, String word2) {
        return word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
    }
    
    public static void main(String[] args) {
        System.out.println(recombine("Math", "Science"));
    }
}
