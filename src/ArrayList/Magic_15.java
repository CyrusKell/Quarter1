/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author cyrus.kell
 */
public class Magic_15 {
    public static void main(String[] args) {
        int[][] a = magic();
        while (!isMagic(a)) {
            a = magic();
        }
        for (int[] row : a) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
    }
    
    public static int[][] magic() {
        int[][] magic = new int[3][3];
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= 9; i++) ints.add(i);
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[i].length; j++) {
                int index = (int)(Math.random() * ints.size());
                magic[i][j] = ints.get(index);
                ints.remove(index);
            }
        }
        return magic;
    }
    
    public static boolean isMagic(int[][] magic) {
        int sum = 0;
        for (int i = 0; i < magic.length; i++) sum += magic[0][i];
        for (int[] row : magic) if (rowSum(row) != sum) return false;
        for (int i = 0; i < magic.length; i++) if (colSum(magic, i) != sum) return false;
        if (diagonalSumFromLeft(magic) != sum) return false;
        if (diagonalSumFromRight(magic) != sum) return false;
        return true;
    }
    
    public static int rowSum(int[] row) {
        int sum = 0;
        for (int n : row) {sum += n;}
        return sum;
    }
    public static int colSum(int[][] arr, int c) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i][c];
        return sum;
    }
    public static int diagonalSumFromLeft(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { sum += arr[i][i]; }
        return sum;
    }
    public static int diagonalSumFromRight(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { sum += arr[i][arr.length - 1 - i]; }
        return sum;
    }
    
}

