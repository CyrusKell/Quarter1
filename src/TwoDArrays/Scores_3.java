/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArrays;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class Scores_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][] teams = new int[3][5];
        for (int i = 0; i < teams.length; i++) {
            for (int k = 0; k < teams[i].length; k++) {
                System.out.println("Enter score of game " + (k+1) + " for team " + (i+1));
                teams[i][k] = in.nextInt();
            }
        }
        
        System.out.print("   ");
        for (int i = 0; i < teams[0].length; i++) {
            System.out.print("team" + i + " ");
        }
        System.out.println();
        for (int i = 0; i < teams.length; i++) {
            System.out.print("G" + i + " ");
            for(int k = 0; k < teams[i].length; k++) {
                System.out.print(teams[i][k] + " ");
                for (int j = 1; j <= 5 - Integer.toString(teams[i][k]).length(); j++) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
