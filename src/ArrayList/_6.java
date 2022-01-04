/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cyrus.kell
 */
public class _6 {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a double:");
            a.add(in.nextDouble());
        }
        System.out.println(a);
        
        System.out.println("Enter a target:");
        Double target = in.nextDouble();
        if (a.contains(target)) System.out.println("Target found at index " + a.indexOf(target));
        else System.out.println("Target not found");
        
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 5) count++;
        }
        System.out.println("There are " + count + " elements > 5");
        
        Double min = a.get(0);
        int index = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(0) < min) {
                min = a.get(0);
                index = i;
            }
        }
        System.out.println("Minimum value of " + min + " at index " + index);
    }
}
