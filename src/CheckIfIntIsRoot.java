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

public class CheckIfIntIsRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = in.nextInt();

        if (integer % 2 == 1) System.out.println("odd");
        if (integer % 5 == 0) System.out.println("divisible by 5");
        
        if (integer % 2 != 1 && integer % 5 != 0) {
            if (integer * integer - 23 * integer + 22 == 0) {
                System.out.println("root");
            } else if (integer % 10 == 4) {
                System.out.println("ends with 4");
            }
        }
        
    }
    
  
    
}
