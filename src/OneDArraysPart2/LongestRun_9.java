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
public class LongestRun_9 {
    public static int longestRun(int[] arr) {
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
                if (maxCount < count) maxCount = count;
            } else count = 1;
        }
        return maxCount;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 2, 6, 6, 6, 6, 5, 5, 5};
        System.out.println(longestRun(arr));
    }
}
