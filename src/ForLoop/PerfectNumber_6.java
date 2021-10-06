/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoop;

/**
 *
 * @author cyrus.kell
 */
public class PerfectNumber_6 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            for (int factor = 1; factor < num; factor++) {
                if (num % factor == 0) sum += factor;
            }
            if (sum == num) System.out.println(num);
        }
    }
}
