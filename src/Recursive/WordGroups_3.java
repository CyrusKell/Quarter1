/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursive;

/**
 *
 * @author cyrus
 */
public class WordGroups_3 {
    public static void wordGroup(String sentence) {
        int k = sentence.indexOf(" ");
        System.out.println(sentence);
        if (k != -1) wordGroup(sentence.substring(k + 1));
    }    
    
    public static void main(String[] args) {
        wordGroup("I am a student");
    }
}
