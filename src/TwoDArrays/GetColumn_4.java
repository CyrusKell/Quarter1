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
public class GetColumn_4 {
    public static int[] getColumn(int[][] a, int c) {
        int[] column = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            column[i] = a[i][c];
        }
        return column;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10,11,12}};
        int[] column = getColumn(a, 2);
        for (int n : column) System.out.println(n);
    }
}
