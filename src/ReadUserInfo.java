/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyrus.kell
 */
import java.util.Scanner;

public class ReadUserInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your gender:");
        String gender = in.nextLine();
        System.out.println("Enter your full name:");
        String fullName = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        System.out.println("Enter your height:");
        float height = in.nextFloat();
        
        System.out.println("Hello " + fullName + "!");
        System.out.println("You are a " + gender + " who is " + age + " years old and " + height + " feet tall!");
    }
}
