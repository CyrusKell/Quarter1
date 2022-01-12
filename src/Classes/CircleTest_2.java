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
public class CircleTest_2 {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.getRadius());
        c.setRadius(4);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.computeArea());
        System.out.println("Circumference: " + c.computeCircumference());
    }
}

class Circle {
    private int radius;
   
    public Circle () {}
    public Circle (int aradius) {
        radius = aradius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int aradius) {
        radius = aradius;
    }
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double computeCircumference() {
        return Math.PI * radius * 2;
    }
}
