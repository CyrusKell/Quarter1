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

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter exam type (A or AB):");
        String examType = in.nextLine();
        if (!examType.equalsIgnoreCase("A") && !examType.equalsIgnoreCase("AB")) {
            System.out.println("Invalid exam type");
            System.exit(0);
        }
        System.out.println("Enter exam score out of 100:");
        int examScore = in.nextInt();
        if (examScore < 0 || examScore > 100) {
            System.out.println("Exam score must be between 0 and 100");
            System.exit(0);
        }
        
        if (examType.equalsIgnoreCase("A")) {
            if (examScore > 60) {
                System.out.println("Score: 5");
            } else if (examScore > 50) {
                System.out.println("Score: 4");
            } else if (examScore > 40) {
                System.out.println("Score: 3");
            } else if (examScore > 30) {
                System.out.println("Score: 2");
            } else if (examScore >= 0 ) {
                System.out.println("Score: 1");
            }
        }
        if (examType.equalsIgnoreCase("AB")) {
            if (examScore > 70) {
                System.out.println("Score: 5");
            } else if (examScore > 60) {
                System.out.println("Score: 4");
            } else if (examScore > 50) {
                System.out.println("Score: 3");
            } else if (examScore > 40) {
                System.out.println("Score: 2");
            } else if (examScore >= 0 ) {
                System.out.println("Score: 1");
            }
        }
    }    
}
        
