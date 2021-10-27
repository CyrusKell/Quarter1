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
public class Shuffle_11 {
    public static int[] shuffle(int[] arr) {
        int[] half1 = new int[arr.length/2];
        int[] half2 = new int[arr.length/2];
        for (int i = 0; i < arr.length/2; i++) {
            half1[i] = arr[i];
        }
        for (int i = 0; i < arr.length/2; i++) {
            half2[i] = arr[i + arr.length/2];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = half1[i/2];
            else arr[i] = half2[i/2];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15,16,17,18,19};
        int[] shuffledArr = shuffle(arr);
        for (int n : shuffledArr) System.out.println(n);
    }
}
