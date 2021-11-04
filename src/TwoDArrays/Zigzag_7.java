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
public class Zigzag_7 {
    public static int[] zigzag(int[][] a) {
        int[] oneD = new int[a.length * a[0].length];
        int j = 0;
        for (int[] row : a) {
            for (int n : row) oneD[j++] = n;
        }
        return oneD;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[] oneD = zigzag(a);
        for (int n : oneD) System.out.print(n + " ");
        System.out.println();
    }
}
