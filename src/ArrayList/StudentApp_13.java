/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;

/**
 *
 * @author cyrus.kell
 */
public class StudentApp_13 {
    public static void main(String args[]) {
        Student antonio = new Student(1234, 3.9, "Antonio");
        Student antonio2 = new Student(1235, 3.8, "Antonio2");
        Student antonio3 = new Student(1234, 3.8, "Antonio3");
        Course a = new Course("a");
        a.addAStudent(antonio);
        a.addAStudent(antonio2);
        a.addAStudent(antonio3);
        a.printAllStudents();
        a.removeAStudent(antonio3);
        a.printAllStudents();
        
    }
}

class Student {
    private int ssn;
    private double gpa;
    private String name;
    
    public Student() {}
    public Student(int ssn, double gpa, String name) {this.ssn = ssn; this.gpa = gpa; this.name = name;}
    @Override
    public String toString() {return "ssn: " + ssn + " gpa: " + gpa + " name: " + name;}
    public boolean isEqual(Student a) {return ssn == a.ssn;}
}

class Course {
    private String courseName;
    private ArrayList<Student> students;
    private int numStudents;
    private final int maxStudents = 3;
    
    public Course(String name) {courseName = name; students = new ArrayList<Student>(); numStudents = 0;}
    public String getCourseName() {return courseName;}
    public boolean addAStudent(Student st) {
        if (numStudents < maxStudents) {
            students.add(st);
            numStudents++;
            return true;
        } else return false;
    }
    public boolean removeAStudent(Student st) {
        if (students.contains(st)) {
            students.remove(st);
            numStudents--;
            return true;
        } else return false;
    }
    public void printAllStudents() {System.out.println(students);}
    
}