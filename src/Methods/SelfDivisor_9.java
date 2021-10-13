/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author cyrus
 */
public class SelfDivisor_9 {
    public static boolean isSelfDivisor(int n) {
        while (n > 0) {
            if (n % 10 == 0 || n % (n % 10) != 0) return false;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isSelfDivisor(105));
    }
}
