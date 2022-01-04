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
public class _5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name:");
            a.add(in.nextLine());
        }
        a.set(2, "John");
        for (String str : a) System.out.print(str + " ");
        a.remove(1);
        System.out.println(a);
        System.out.println(a.contains("Jonny"));
        a.clear();
    }
}
