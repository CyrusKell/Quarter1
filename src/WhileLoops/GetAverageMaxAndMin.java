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

public class GetAverageMaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers or 0 to stop");
        int integer = in.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0, sum = 0;
        while (integer != 0) {
            if (integer > max) {max = integer;}
            if (integer < min) {min = integer;}
            
            sum += integer;
            count++;
            
            integer = in.nextInt();
        }
        
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Average value: " + (double)sum / count);
        
    }
}
