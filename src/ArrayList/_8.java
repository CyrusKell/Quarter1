/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author cyrus.kell
 */
public class _8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter an integer:");
            list.add(in.nextInt());
        }
        System.out.println(list);
        removeDuplicates(list);
        sort(list);
        System.out.println(list);
        
        
    }
    
    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
           for (int j = 0; j < list.size(); j++) {
               if (list.get(i) == list.get(j) && i != j) {
                   list.remove(i--);
                   break;
               }
           } 
        }
    }
    
    public static void sort(ArrayList<Integer> list) { 
        for (int i = 1; i < list.size(); i++) {
           if (list.get(i) < list.get(i-1)) {
               int temp = list.get(i);
               list.set(i, list.get(i-1));
               list.set(i-1, temp);
               sort(list);
           }
        }
    }
}
