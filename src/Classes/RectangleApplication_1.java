/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author cyrus.kell
 */
public class RectangleApplication_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1,2);
        r1.printInfo();
        r2.printInfo();
    }
}

class Rectangle {
    private int width;
    private int height;
    
    public Rectangle() {
        width = 0;
        height = 0;
    }
    public Rectangle(int awidth, int aheight) {
        width = awidth;
        height = aheight;
    }
    
    public void printInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}