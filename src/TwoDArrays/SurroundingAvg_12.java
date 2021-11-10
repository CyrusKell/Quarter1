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
public class SurroundingAvg_12 {
    public static double[][] getSurroundingAvg(double[][] a) {
        double[][] copy = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) copy[i][j] = a[i][j];
        }
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                a[i][j] = (copy[i-1][j] + copy[i+1][j] + copy[i][j-1] + copy[i][j+1]) / 4.0;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        double[][] a = {{1,2,3,4},{1,0,1,2},{0,1,2,1}};
        double [][] avgs = getSurroundingAvg(a);
        for (double[] row : avgs) {
            for (double n : row) System.out.print(n + "\t");
            System.out.println();
        }
    }
}
