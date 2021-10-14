/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursive;

/**
 *
 * @author cyrus.kell
 */
public class Fibonacci_2 {
    public static int fibonacci(int n) {
        int count = 0;
        if (n != count) {
            int i = 1;
            count++;
            i = fibonacci(i + n);
        }
        return i;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
