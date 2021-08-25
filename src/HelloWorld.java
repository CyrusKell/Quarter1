/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
public class HelloWorld {
    public static void main(String[] args) {
        String[] printStatements = {
            "Hello World",
            "Hi, my name is Cyrus Kell",
            "I am taking Calculus BC",
            "I'm a junior at St. Thomas Aquinas High School",
            "I want to become a high level software engineer and I will accomplish this by studying computer science to the best of my ability"};
    
        for(String printStatement : printStatements) {
            System.out.println(printStatement);
        }
    }
}
