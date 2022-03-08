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
public class InsertionSort_1 {
    public static void main(String[] args) {
        int[] a = {6,3,2,8,3,8,4,6,0,1,2};
        insertionSort1(a);
        for (int n : a) System.out.print(n + " ");
        System.out.println();
    }
    
    public static void insertionSort1(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = 0;
            while (a[j] < current) j++;
            for (int k = i; k > j; k--) a[k] = a[k-1];
            a[j] = current;
        }
    }
}
