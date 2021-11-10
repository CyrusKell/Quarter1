/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
public class Test {
    public static void main(String[] args) {
        int t = 0;
        int f = 0;
        for (int i = 0; i < 100000; i++) {
            double rand = Math.random() * 100 + 1;
            if (rand <= 60) t++;
            else f++;
        }
        System.out.println((double)t/(t+f) * 100 + "%");
    }
}
