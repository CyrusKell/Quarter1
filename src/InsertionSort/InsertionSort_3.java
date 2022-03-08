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
public class InsertionSort_3 {
    public static void main(String[] args) {
        String[] a = {"abc", "ab", "abcdef", "a", "abcd", "xyz", "dfe", "xyy"};
        insertionSort3(a);
        for (String n : a) System.out.print(n + " ");
        System.out.println();
    }
    
    public static void insertionSort3(String[] a) {
        for (int i = 1; i < a.length; i++) {
            String current = a[i];
            int j = 0;
            while (a[j].length() < current.length()) j++;
            while (a[j].length() == current.length() && a[j].compareTo(current) < 0) j++;
            for (int k = i; k  > j; k--) a[k] = a[k-1];
            a[j] = current;
        }
    }
}
