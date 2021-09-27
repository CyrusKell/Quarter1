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
public class GetRandomSqrt {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);
        
        while (num1 != (double)num2 / num1 && num2 != (double)num1 / num2) {
            num1 = (int)(Math.random()*101);
            num2 = (int)(Math.random()*101);
        }
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        
    }
}
