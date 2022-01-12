/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author cyrus.kell
 */
public class SortAndMergeTest_12 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer:");
            a.add(in.nextInt());
        }
        System.out.println(a);
        SortAndMerge.sort(a);
        System.out.println(a);
        SortAndMerge.removeDuplicates(a);
        System.out.println(a);
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(SortAndMerge.merge(a,b));  
    }
}

 class SortAndMerge {
    public static void sort(ArrayList<Integer> a ) {
        for (int i = 1; i < a.size(); i++) {
            if(a.get(i-1) > a.get(i)) {
                int temp = a.get(i-1);
                a.set(i-1, a.get(i));
                a.set(i, temp);
                sort(a);
                break;
            }
        }
    }
    
    public static void removeDuplicates(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
           for (int j = 0; j < a.size(); j++) {
               if (a.get(i) == a.get(j) && i != j) {
                   a.remove(i--);
                   break;
               }
           } 
        }
    }
    
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>(a);
        for (int n : b) c.add(n);
        removeDuplicates(c);
        sort(c);
        return c;
    }
 }