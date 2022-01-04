/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author cyrus.kell
 */
public class _10 {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<String>(Arrays.asList("A", "B", "D", "E", "?", "B"));
        ArrayList<String> key = new ArrayList<String>(Arrays.asList("A", "C", "D", "A", "B", "E"));
        System.out.println(getScore(answer, key));
    }
    
    public static double getScore(ArrayList<String> answer, ArrayList<String> key) {
        double score = 0;
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) == key.get(i)) score++;
            else if (answer.get(i).equals("?")) score -= 0.25;
            else score -= 0.5;
        }
        return score;
    }
}
