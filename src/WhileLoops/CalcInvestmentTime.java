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

public class CalcInvestmentTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter principle amount in dollars");
        double principle = in.nextDouble();
        
        int months = 0;
        while (principle < 50000) {
            principle *= 1.05;
            months++;
        }
        
        System.out.println("It will take " + months + " months for your investment to be greater than or equal $5000");
    }
}
