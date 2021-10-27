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
public class Mode_8 {
    public static void findMode(int[] arr) {
        int mode = 0;
        int maxCount = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        if (maxCount == 1) System.out.println("There is no Mode");
        else System.out.println(mode);
    }
    
    public static void main(String[] args) {
        int[] arr = {5,1,11,3,2};
        findMode(arr);  
    }    
}
