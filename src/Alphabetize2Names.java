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

public class Alphabetize2Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name 1:");
        String name1 = in.nextLine();
        System.out.println("Enter Name 2:");
        String name2 = in.nextLine();
        
        System.out.println("Comparison result: " + name1.compareTo(name2));
        
        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + ", " + name2);
        } else {
            System.out.println(name2 + ", " + name1);
        }
    }
}
