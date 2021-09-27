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
public class CalcTimeUntilBroke {
    public static void main(String[] args) {
        int principle = 1000000;
        int years = 0;
        
        while  (principle > 0) {
            principle *= 1.08;
            principle -= 100000;
            years++;
        }
        
        System.out.println("It will take " + years + " years for Lucky to empty his account");
    }
}
