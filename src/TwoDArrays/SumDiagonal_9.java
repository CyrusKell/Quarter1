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
public class SumDiagonal_9 {
    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        int j = 0;
        for (int[] row : a) {
            sum += row[j] + row[a[0].length - 1 - j];
            j++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,1,2,3}, {4,5,6,7}};
        System.out.println(sumDiagonal(a));
    }
}
