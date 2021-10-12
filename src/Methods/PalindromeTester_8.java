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
public class PalindromeTester_8 {
    public static boolean PalindromeTester(String string) {
        string = string.toUpperCase();
        int k = string.indexOf(" ");
        while (k != -1) {
            string = string.substring(0, k) + string.substring(k + " ".length());
            k = string.indexOf(" ");
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i))) {
                string = string.substring(0, i) + string.substring(i + 1);
                i--;
            }
        }
        
        boolean isPalindrome = true;
        for (int i = 0; i <= string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        
        return isPalindrome;
    }
    
    public static void main(String[] args) {
        System.out.println(PalindromeTester("Ta co. ,,. c,.at"));
    }
}
