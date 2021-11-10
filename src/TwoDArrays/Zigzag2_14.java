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
public class Zigzag2_14 {
    public static int[] zigzag(int[][] a) {
        int[] output = new int[a.length*a[0].length];
        int o = 0;
//        for (int i = 0; i < a[0].length; i++) {
//            int k = i;
//            int j = 0;
//            while(k >= 0 && j <= a.length) {
//                output[o++] = a[j++][k--];
//            }
//        }
        int x = 0;
        int y = 0;
        while (o < output.length) {
            output[0] = a[y][x];
            while (x-1 >= 0) {x--; y++; output[0] = a[y][x];}
            while (y-1 >=0) {x++; y--; output[0] = a[y][x];}
        }
        return output;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7,9,0}, {2,4,6,8,0,2}, {3,6,7,5,9,3,}, {4,6,9,8,1,0}, {2,7,4,9,3,6,}, {1,4,2,9,3,5,}};
        for (int n : zigzag(a)) System.out.print(n + "");
        System.out.println();
    }
}
