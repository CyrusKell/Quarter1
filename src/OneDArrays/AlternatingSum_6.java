/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArrays;

/**
 *
 * @author cyrus.kell
 */
public class AlternatingSum_6 {
    public static void main(String[] args) {
        int[] a = {1,4,9,16,9,7,4,9,11};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            } else {
                sum -= a[i];
            }
        }
        System.out.println(sum);
    }
}
