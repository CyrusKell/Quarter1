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
public class MethodsInClass_11 {
    public static boolean[][] initialize(int[][] a) {
        boolean[][] bools = new boolean[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                bools[i][j] = Math.random() * 100 + 1 <= 60;
            }
        }
        
        return bools;
    }
    
    public static boolean evaluate(int[][] a, int row, int col) {
        boolean[][] initialized = initialize(a);
        int numOfTrue = 0;
        for (boolean initRow[] : initialized) {
            if (initRow[col] == true) numOfTrue++;
        }
        
        if(initialized[row][col]){
            if (numOfTrue%2 == 0) return false;
        } else {
            if (numOfTrue%3 == 0) return true;
        }
        return initialized[row][col];
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5}, {6,7,8,9,10}};
        boolean[][] initialized = initialize(a);
        for (boolean[] row : initialized) {
            for (boolean n : row) System.out.print(n + " ");
            System.out.println();
        }
        
        System.out.println(evaluate(a, 0, 0));
    }
}
