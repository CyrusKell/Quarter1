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
public class _4 {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            alist.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(alist.get(6));
        alist.remove(3);
        alist.remove(4);
        System.out.println(alist);
        alist.set(3, 1);
        alist.set(4, 1);
        int sum = 0;
        for (int n : alist) {
            sum += n;
        }
        System.out.println(sum);
    }
}
