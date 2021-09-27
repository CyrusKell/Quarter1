/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

/**
 *
 * @author jayke
 */
import java.util.Scanner;

public class PrintGoodJob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade (A, B, or C) or Q to quit");
        String grade = in.nextLine();
        
        while (!grade.equalsIgnoreCase("Q")) {
            if (grade.equalsIgnoreCase("A")||grade.equalsIgnoreCase("B")||grade.equalsIgnoreCase("C")) {
                System.out.println("Good job!");
            } else {
                System.out.println("Please enter A, B, C, or Q");
            }
            System.out.println("Enter another letter grade (A, B, or C) or Q to quit");
            grade = in.nextLine();
        }
    }
}
