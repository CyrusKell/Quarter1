
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
        ArrayList<String> names  = new ArrayList<String>();
        names.add(0, "Anya");
        names.add(0, "Ben");
        names.add(0, "Cathy");
        for(int k = 0; k < names.size(); k++) System.out.print(names.get(k) + " ");
    }
}
