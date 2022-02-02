/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

public class FindCombinationsGivenSumAndProduct_14 {
     public static void main (String[] args) {
        ArrayList<int[]> combos = findCombinations(7,8);
        for (int[] i : combos) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
     
    static ArrayList<int[]> findCombinations(int sum, int targetProduct) {
        int arr[] = new int [sum];
        ArrayList<int[]> sumCombos = new ArrayList<>();
        findSumCombinations(arr, 0, sum, sum, sumCombos);
        for (int i = 0; i < sumCombos.size(); i++) {
            int product = 1;
            for (int j : sumCombos.get(i)) if (j != sum) product *= j;
            if (product != targetProduct) {
                sumCombos.remove(i);
                i--;
            } 
        }
        return sumCombos;
    }
    
    static void findSumCombinations(int arr[], int index, int num, int reducedNum, ArrayList<int[]> sumCombos) {
        if (reducedNum < 0) return;
        if (reducedNum == 0) {
            int[] reducedArr = new int[index];
            for (int i = 0; i < index; i++) reducedArr[i] = arr[i];
            sumCombos.add(reducedArr.clone());
            return;
        }
        int prev = 1;
        if (index != 0) prev = arr[index - 1];
        for (int k = prev; k <= num ; k++) {
                arr[index] = k;
                findSumCombinations(arr, index + 1, num, reducedNum - k, sumCombos);
        }
    }
}