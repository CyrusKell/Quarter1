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
public class PrintChar_3 {
    public static void printChar(char c, int times, int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int x = 1; x <= times; x++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printChar('A', 5, 10);
    }
}
