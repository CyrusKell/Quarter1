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

public class CompareTwoNamesAlphabetically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name 1:");
        String name1 = in.nextLine();
        System.out.println("Enter name 2:");
        String name2 = in.nextLine();
        
        if (name1.compareToIgnoreCase(name2) < 0) System.out.println("Name 1 comes before name 2");
        if (name1.compareToIgnoreCase(name2) == 0) System.out.println("SAME");
        if (name1.compareToIgnoreCase(name2) > 0) System.out.println("Name 1 comes after name 2");
    }
}
