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
public class Sort_5 {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                int value = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = value;
                sort(arr);
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,3,8,4,2};
        int[] sortedArr = sort(arr);
        for (int num : sortedArr) {
            System.out.print(num);
        }
        System.out.println();
    }
}
