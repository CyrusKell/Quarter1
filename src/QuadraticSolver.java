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

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a following the formula ax^2 + bx +c = 0");
        double a = in.nextInt();
        System.out.println("Enter the value of b following the formula ax^2 + bx +c = 0");
        double b = in.nextInt();
        System.out.println("Enter the value of c following the formula ax^2 + bx +c = 0");
        double c = in.nextInt();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Any value of x can be the solution");
        } else if (a == 0 && b == 0) {
            System.out.println("No solution");
        } else if (a == 0) {
            System.out.println("Solution: " + -1 * c / b);
        } else {
            double discriminant = b * b - 4 * a * c;
            
            if (discriminant < 0) {
                System.out.println("No real solution");
            }
            if (discriminant == 0) {
                System.out.println("Solution: " + ((-1 * b + Math.sqrt(discriminant)) / (2 * a)));
            }
            if (discriminant > 0) {
                System.out.println("Solution 1: " + ((-1 * b + Math.sqrt(discriminant)) / (2 * a)));
                System.out.println("Solution 2: " + ((-1 * b - Math.sqrt(discriminant)) / (2 * a)));
            }
        }
        
    }
}
