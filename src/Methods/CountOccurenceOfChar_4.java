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
public class CountOccurenceOfChar_4 {
    public static int countOccurenceOfChar(char c, String s) {
        int k = s.indexOf(c);
        int count = 0;
        while (k != -1) {
            count++;
            k = s.indexOf(c, k + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(countOccurenceOfChar('t', "the tuna triumphed over the other fish"));
    }
}
