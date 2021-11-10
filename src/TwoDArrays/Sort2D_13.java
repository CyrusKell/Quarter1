/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArrays;

/**
 *
 * @author cyrus.kell
 */
public class Sort2D_13 {
    public static int[][] sort2D(int[][] a) {
        int[] oneD = new int[a.length * a[0].length];
        int f = 0;
        for (int[] row : a) {
            for (int n : row) oneD[f++] = n;
        }
        int[] sorted = sort(oneD);
        int[][] twoD = new int[a.length][a[0].length];
        int g = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = sorted[g++];
            }
        }
        return twoD;
    }
    
    public static int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                sort(a);
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,4,9}, {5,2,8}, {3,7,6}};
        int[][] sortedArr = sort2D(a);
        for (int row[] : sortedArr) {
            for(int n : row) System.out.print(n + " ");
            System.out.println();
        }
    }
}
