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
public class Median_7 {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                sort(arr);
            }
        }
        return arr;
    }
    
    public static double findMedian(int[] arr) {
        arr = sort(arr);
        if (arr.length % 2 != 0) return arr[arr.length/2];
        return (arr[arr.length/2 - 1] + arr[arr.length/2]) / 2.0;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8};
        System.out.println(findMedian(arr));
    }
}
