/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author cyrus.kell
 */
public class BinarySearch_2 {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        System.out.println(binarySearch(a, "h"));
    }
    
    public static int binarySearch(String[] a, String n) {
        int min = 0;
        int max = a.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (a[mid].equals(n)) return mid;
            if (n.compareTo(a[mid]) < 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
