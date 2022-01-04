/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
/**
 *
 * @author cyrus.kell
 */
public class _9 {
    public static void main(String[] args) {
        System.out.println(getDigitsReverse(1234));
        System.out.println(getDigits(1234));
    }
    
    public static ArrayList<Integer> getDigitsReverse(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }
    
    public static ArrayList<Integer> getDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(0,n % 10);
            n /= 10;
        }
        return digits;
    }
}
