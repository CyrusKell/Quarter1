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
        int n = in.nextInt();

        boolean a = n % 2 != 0 && n > 10;
        boolean b = n % 5 == 0 && n % 10 != 0;
        boolean c = n * n - 23 * n + 22 == 0 || n % 10 == 3;
        
        if (a || b || c) {
            System.out.println("TRUE");
        }
        
    }
    
  
    
}
