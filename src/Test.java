
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cyrus.kell
 */
public class Test {

    public static void main(String[] args) {
        String guess = "abc";
        String secret = "abcabc";
        int count = 0;
        int index = secret.indexOf(guess);
        while (index != -1 ) {
            count++;
            index = secret.indexOf(guess, index + 1);
        }
        System.out.println(count);
    }
}
