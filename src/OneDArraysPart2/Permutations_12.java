/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArraysPart2;

/**
 *
 * @author cyrus.kell
 */
public class Permutations_12 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void permutations(int[] arr, int j) {
        for (int i = j; i < arr.length; i++) {
            swap(arr, i, j);
            permutations(arr, j+1);
            swap(arr, i, j);
        }
        if (j == arr.length - 1) {
            for(int n : arr) System.out.print(n + ",");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3,7,8};
        permutations(arr, 0);
    }
}
