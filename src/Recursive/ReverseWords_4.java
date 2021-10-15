/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursive;

/**
 *
 * @author cyrus
 */
public class ReverseWords_4 {
    public static void reverse(String str) {
       int k = str.indexOf(" ");
       if (k != -1) {
           reverse(str.substring(k + 1));
           System.out.println(str.substring(0, k));

       } else {
           System.out.println(str);
       }
    }   
    
    public static void main(String[] args) {
        reverse("I am a student");
    }
}
