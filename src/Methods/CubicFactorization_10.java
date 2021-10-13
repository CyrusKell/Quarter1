/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author cyrus
 */
public class CubicFactorization_10 {
    public static String factorCubic(int a, int b, int c, int d, int z) {
        b += a * z;
        c += b * z;
        d += c * z;
        return "(x + " + -1 * z + ")(" + a + "x^2 + " + b + "x + " + c + ")";
    }
    
    public static void main(String[] args) {
        System.out.println(factorCubic(3,-5,-2,4,1));
    }
}
