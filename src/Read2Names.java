/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class Read2Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name 1:");
        String name1 = in.nextLine();
        System.out.println("Enter name 2:");
        String name2 = in.nextLine();
        
        System.out.println("Length of name 1: " + name1.length());
        System.out.println("Length of name 2: " + name2.length());
        
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Name 1 is the same as name 2");
        } else {
            System.out.println("Name 1 is not same as name 2");
        }
    }
}
