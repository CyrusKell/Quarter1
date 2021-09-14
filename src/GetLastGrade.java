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

public class GetLastGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number grades and enter -1 to stop:");
        int i = in.nextInt();
        
        int finalGrade = 0;
        while (i != -1) {
            finalGrade = i;
            i = in.nextInt();
        }
        
        if (finalGrade >= 90) {
            System.out.println("Final grade: A");
        } else if (finalGrade >= 80) {
            System.out.println("Final grade: B");
        } else if (finalGrade >= 70) {
            System.out.println("Final grade: C");
        } else {
            System.out.println("Final grade: D");
        }
        
        
    }
}
