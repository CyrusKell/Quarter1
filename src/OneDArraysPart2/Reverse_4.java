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
public class Reverse_4 {
    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j++] = arr[i];
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] reverse = reverse(arr);
        for(int num : arr) {
            System.out.print(num);
        }
        System.out.println();
        for(int num : reverse) {
            System.out.print(num);
        }
        System.out.println();
    }
}
