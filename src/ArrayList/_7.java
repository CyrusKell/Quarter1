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
public class _7 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) list.add(Math.random());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) if (list.get(i) < 0.5) list.remove(i--);
        System.out.println(list);
    }
}
