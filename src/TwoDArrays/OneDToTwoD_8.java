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
public class OneDToTwoD_8 {
    public static int[][] convert(int[] a) {
        int[][] twoD = new int[(int)Math.ceil(a.length/4.0)][4];
        int j = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int k = 0; k < twoD[0].length; k++) {
                if (j < a.length) twoD[i][k] = a[j++];
                else twoD[i][k] = 10;
            }
        }
        return twoD;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[][] twoD = convert(a);
        for (int[] row : twoD) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
    }
}
