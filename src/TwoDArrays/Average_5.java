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
public class Average_5 {
    public static void main(String[] args) {
        int[][] a = {{1,3,0,7,9},{2,4,6,8,10},{0,3,6,9,8}};
        double[] sums = new double[a[0].length];
        for (int i = 0; i < a[0].length; i++) {
            for (int[] row : a) {
                sums[i] += row[i];
            }
        }
        
        for (int[] row : a) {
            System.out.print("      ");
            for (int n : row) System.out.print(n + "    ");
            System.out.println();
        }
        
        System.out.print("Aver: ");
        for (double sum : sums) {System.out.printf("%.1f", sum/a.length); System.out.print("  ");}
        System.out.println();
    }
}
