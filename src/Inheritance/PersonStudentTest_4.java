/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author cyrus.kell
 */
public class PersonStudentTest_4 {
    public static void main(String args[]) {
        Person p1 = new Person("Antonio", 26);
        Person p2 = new Student("Cyrus", 17, 4.0, new ArrayList<>(Arrays.asList("Math", "Physics")));
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name; this.age = age;
    }
    public String toString() {
        return "Name: " + name + " Age : " + age;
    }
}

class Student extends Person {
    double gpa;
    ArrayList<String> courses;
    public Student(String name, int age, double gpa, ArrayList<String> courses) {
        super(name, age);
        this.gpa = gpa; this.courses = courses;
    }
    public double getGpa() {return gpa;}
    public String toString() {
        return super.toString() + " GPA: " + gpa + " Courses: " + courses;
    }
}