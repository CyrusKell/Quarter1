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
public class IsIncreasing_6 {
    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,2};
        System.out.println(isIncreasing(arr));
    }
}
