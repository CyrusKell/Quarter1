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
public class SelectionSort_1 {
    public static void main(String[] args) {
        int[] a = {454,67,23,78,23,72};
        selectionSort(a);
        for (int n : a) System.out.print(n + " ");
        System.out.println();
    }
    
    public static void selectionSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int indexMax = i;
            for (int k = i - 1; k >= 0; k--) {
                if (a[k] > a[indexMax] ) {
                    indexMax = k;
                }
                int temp = a[i];
                a[i] = a[indexMax];
                a[indexMax] = temp;
            }
        }
    }
}
