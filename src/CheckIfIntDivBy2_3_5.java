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

public class CheckIfIntDivBy2_3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = in.nextInt();
        
        if (integer % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
            
            if (integer % 3 == 0 && integer % 5 == 0) {
                System.out.println("Number is divisible by 3 and 5");
            }
        }
        
        
    }
}
