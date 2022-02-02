/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;


/**
 *
 * @author cyrus.kell
 */
public class MagicSquare_16 {
    public static void main(String[] args) {
        for (int[] row : getMagicSquare(5)) {
            for (int n : row) System.out.print(n + "\t");
            System.out.println();
        }
    }
    
    public static int[][] getMagicSquare(int size) {
        int[][] magic = new int[size][size];
        int i = size - 2; int j = size / 2 - 1;
        for (int k = 1; k <= Math.pow(magic.length, 2); k++) {
            if (magic[++i % size][++j % size] != 0 || (i == size - 1 && j == size - 1)) {
                 i -= 2; j--;
            }
            magic[i % size][j % size] = k;
        }
        return magic;
    }
}
