/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

/**
 *
 * @author cyrus.kell
 */
public class StringSort_2 {
    public static void main(String[] args) {
        String[] a = {"b", "d", "a", "z", "f", "h", "c", "l"};
        stringSort(a);
        for (String n : a) System.out.print(n + " ");
        System.out.println();
    }
    
    public static void stringSort(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int indexMin = i;
            for (int k = i + 1; k < a.length; k++) {
                if (a[k].compareTo(a[indexMin]) < 0) {
                    indexMin = k;
                }
            }
            String temp = a[i];
            a[i] = a[indexMin];
            a[indexMin] = temp;            
        }
    }
}
