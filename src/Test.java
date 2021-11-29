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
        var n = new Integer(4); 
        Object i = new Integer(n.intValue());
        
        Object k = 4;
        System.out.println(k);
        k = "hi";
        k = new String("test");
        System.out.println(k);
    }
}
