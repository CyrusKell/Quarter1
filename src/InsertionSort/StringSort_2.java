/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

/**
 *
 * @author cyrus.kell
 */
public class StringSort_2 {
    public static void main(String[] args) {
        String[] a = {"b", "d", "a", "z", "f", "h", "c", "l"};
        insertionSort2(a);
        for (String n : a) System.out.print(n + " ");
        System.out.println();
    }
    
    public static void insertionSort2(String[] a) {
        for (int i = 1; i < a.length; i++) {
            String current = a[i];
            int j = 0;
            while (a[j].compareTo(current) < 0) j++;
            for (int k = i; k > j; k--) {
                a[k] = a[k-1];
            }
            a[j] = current;
            
        }
    }
}
