/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author cyrus.kell
 */
public class SequentialSearch_1 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for (int[] row : a) {
            for (int n : row) System.out.print(n + "\t");
            System.out.println();
        }
        System.out.println(sequentialSearch(a, 8));
    }
    
    public static String sequentialSearch(int[][] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] == n) return "(" + j + "," + i + ")";
            }
        }
        return null;
    }
}
