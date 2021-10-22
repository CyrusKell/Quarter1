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
public class Search {
    public static boolean search(int[] array, int target) {
        for (int num : array) {
            if (num == target) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(search(array, 4));
    }
}
