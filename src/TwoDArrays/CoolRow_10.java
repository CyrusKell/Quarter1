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
public class CoolRow_10 {
    public static void hasCoolRow(int[][] a) {
        for (int[] row : a) {
            boolean isCoolRow = true;
            for (int n : row) if (n != 1) isCoolRow = false;
            if (isCoolRow) System.out.println("has cool row");
        }
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,0,0,1},{1,1,1,1},{0,1,1,0},{1,0,0,1}};
        hasCoolRow(a);
    }
}
