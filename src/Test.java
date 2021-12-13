
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        int k;
        for(k = 1; k<= 8; k++)list.add(k);
        for(k = 0; k < list.size(); k ++) list.remove(k); 
        for(k = 0; k < list.size(); k++) System.out.print(list.get(k) + " ");
        System.out.println();
    }
}
