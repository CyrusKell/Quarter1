/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoreAbtStrings;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class RockPaperScissors6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rock, paper, or scissors to play or enter q to quit:");
        String userInput = in.nextLine();
   
        String[] options = {"rock", "paper", "scissors"};
        
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        while (!userInput.equals("q")) {
            boolean found = false;
            for (String option : options) {
                if (option.equals(userInput)) {
                    found = true;
                    break;
                }
            }

            String computerInput = options[(int)(Math.random() * 3)];

            if (found) {
                System.out.println();
                System.out.println("Your input: " + userInput);
                System.out.println("Computer input: " + computerInput);
            } else {
                System.out.println("Please enter a valid option (rock, paper, or scissors):");
            }
            
            boolean rock_scissors = userInput.equals("rock") && computerInput.equals("scissors");
            boolean paper_rock = userInput.equals("paper") && computerInput.equals("rock");
            boolean scissors_paper = userInput.equals("scissors") && computerInput.equals("paper");

            boolean scissors_rock = userInput.equals("scissors") && computerInput.equals("rock");
            boolean rock_paper = userInput.equals("rock") && computerInput.equals("paper");
            boolean paper_scissors = userInput.equals("paper") && computerInput.equals("scissors");

            if (userInput.equals(computerInput)) {
                System.out.println("You tied!");
                ties++;
            }
            if (rock_scissors || paper_rock || scissors_paper) {
                System.out.println("You won!");
                userWins++;
            }
            if (scissors_rock || rock_paper || paper_scissors) {
                System.out.println("You lost.");
                computerWins++;
            }
        
            System.out.println();
            userInput = in.nextLine();
        }
              
        System.out.println("You won " + userWins + " times");
        System.out.println("The computer won " + computerWins + " times");
        System.out.println("You tied " + ties + " times");
    }
}
