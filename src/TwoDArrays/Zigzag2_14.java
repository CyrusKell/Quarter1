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
        int o, x, y, dx, dy;
        o = x = y = dx = dy = 0;
        while (o < output.length) {
            output[o++] = a[y][x];
            if (x == a[y].length - 1) {
                output[o++] = a[++y][x];
                dx = -1; dy = 1;
            } else if (y == a.length - 1) {
                output[o++] = a[y][++x];
                dx = 1; dy = -1;
            } else if (y == 0) {
                output[o++] = a[y][++x];
                dx = -1; dy = 1;              
            } else if (x == 0) {
                output[o++] = a[++y][x];
                dx = 1; dy = -1;
            }
            x += dx;
            y += dy;  
        }
        return output;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7,9,0}, {2,4,6,8,0,2}, {3,6,7,5,9,3,}, {4,6,9,8,1,0}, {2,7,4,9,3,6,}, {1,4,2,9,3,5,}};
        for (int[] row : a) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
        System.out.println();
        for (int n : zigzag(a)) System.out.print(n + " ");
        System.out.println();
    }
}
