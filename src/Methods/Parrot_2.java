/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class Parrot_2 {
    public static void parrot() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Have a nice day");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter continues to continue or quit to quit");
        String input = in.nextLine();
        
        while (!input.equalsIgnoreCase("quit")) {
            parrot();
            System.out.println("Enter continues to continue or quit to quit");
            input = in.nextLine();
        }
    }
}
