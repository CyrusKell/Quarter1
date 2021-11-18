/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author cyrus.kell
 */
public class LatinApp_4 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for (int n : Latin.getColumn(a, 0)) System.out.print(n + " ");
        System.out.println();
        
        int[] b = {1,2,3,4};
        int[] c = {1,2,3};
        System.out.println(Latin.hasAllValues(c, b));
        
        int[] d = {1,2,3,4};
        System.out.println(Latin.containsDuplicate(d));
        
        int[][] e = {{1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3}};
        for (int[] row : e) {for (int n : row) System.out.print(n + " "); System.out.println();}
        System.out.println(Latin.isLatin(e));
    }
}

class Latin {
    public static int[] getColumn(int[][] a, int c) {
        int[] col = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            col[i] = a[i][c];
        }
        return col;
    }
    
    public static boolean contains(int[] a, int j) {
        for (int n : a) if (n == j) return true;
        return false;
    }
    
    public static boolean hasAllValues(int[] a, int[] a2) {
        for (int n : a) if (!contains(a2, n)) return  false;
        return true;
    }
    
    public static boolean containsDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j  < a.length; j++) {
                if (j != i && a[i] == a[j]) return true;
            }
        }
        return false;
    }
    
    public static boolean isLatin(int[][] a) {
        if(containsDuplicate(a[0])) return false;
        for(int i = 1; i < a.length; i++) if(!hasAllValues(a[0], a[i])) return false;
        for(int i = 0; i < a[0].length; i++) if(!hasAllValues(getColumn(a, i), a[0])) return false; 
        return true;     
    }
}
