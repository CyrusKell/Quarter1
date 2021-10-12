/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class MaxStepsAndGoal_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter max amount of steps:");
        int maxSteps = in.nextInt();
        System.out.println("Enter goal amount:");
        int goal = in.nextInt();
        
        System.out.println(compute(maxSteps, goal));
    }
    
    public static boolean compute(int maxSteps, int goal) {
        int sum = 0;
        for (int i = 1; i <= maxSteps; i++) {
            sum += (int)(Math.random() * 10 + 1);
            if (sum < 0 || sum >= goal) break;
        }
        
        System.out.println(sum + " , " + goal);
        return sum >= goal;
    }
}
