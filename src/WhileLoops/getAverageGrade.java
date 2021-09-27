/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class getAverageGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        
        int sum = 0, count = 0;
        while (grade != -1) {
            sum += grade;
            count++;
            grade = in.nextInt();
        }
        
        int average = sum / count;
        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
