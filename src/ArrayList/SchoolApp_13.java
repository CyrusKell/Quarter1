/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cyrus.kell
 */
public class SchoolApp_13 {
    public static void main(String args[]) {
        Guidance guide = new Guidance();
        Student antonio = new Student(34534534, 4.5, "Antonio");
        Student cyrus = new Student(56445424, 5.1, "Cyrus");
        Student john = new Student(3453453, 4.8, "John");
        Student joseph = new Student(128345, 4.2, "Joseph");
        Student joe = new Student(8447907, 5.0, "Joe");
        Course math = new Course("Math");
        Course english = new Course("English");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");
        math.addAStudent(antonio);
        math.addAStudent(cyrus);
        english.addAStudent(antonio);
        physics.addAStudent(cyrus);
        chemistry.addAStudent(john);
        chemistry.addAStudent(joseph);
        chemistry.addAStudent(joe);
        Course[] courses = new Course[]{math, english, physics, chemistry};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to add a student to a course, 2 to drop a student from a course, 3 to print the info of all students in the school, 4 to find the best student in school, or 5 to stop the program");
        int i = in.nextInt();
        while (i != 5) {
            
            if (i == 1) {
                System.out.println("Enter course name:");
                in.nextLine();
                String courseName = in.nextLine();
                System.out.println("Enter student ssn:");
                int ssn = in.nextInt();
                System.out.println("Enter student gpa:");
                double gpa = in.nextDouble();
                in.nextLine();
                System.out.println("Enter student name:");
                String name = in.nextLine();
                Student student = new Student(ssn, gpa, name);
                guide.addStudentToCourse(courses, student, courseName);
            }
            
            if (i == 2) {
                in.nextLine();
                System.out.println("Enter course name:");
                String courseName = in.nextLine();
                System.out.println("Enter student ssn:");
                int ssn = in.nextInt();
                Student student = new Student();
                student.setSsn(ssn);
                guide.dropStudentFromCourse(courses, student, courseName);
            }
            
            if (i == 3) guide.printAllStudents(courses);
            if (i == 4) guide.printBestStudent(courses);
            System.out.println("Enter 1 to add a student to a course, 2 to drop a student from a course, 3 to print the info of all students in the school, 4 to find the best student in school, or 5 to stop the program");
            i = in.nextInt();
        }
        
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
    public void setSsn(int ssn) {this.ssn = ssn;}
    public double getGpa() {return gpa;}
    public boolean isEqual(Student a) {return ssn == a.ssn;}
}

class Course {
    private final String courseName;
    private final ArrayList<Student> students;
    private int numStudents;
    private final int maxStudents = 3;
    
    public Course(String name) {courseName = name; students = new ArrayList<>(); numStudents = 0;}
    public String getCourseName() {return courseName;}
    public boolean addAStudent(Student st) {
        if (numStudents < maxStudents) {
            students.add(st);
            numStudents++;
            return true;
        } else return false;
    }
    public boolean removeAStudent(Student st) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).isEqual(st)) {
                students.remove(i);
                numStudents--;
                System.out.println(students);
                return true;
            }
        }

        return false;
    }
    public void printAllStudents() {System.out.println(students);}
    public ArrayList<Student> getAllStudents() {return students;}
}

class Guidance {
    public Course findTheCourse(Course[] arrayCourse, String courseName) {
        for (Course a : arrayCourse) if (a.getCourseName().equals(courseName)) return a;
        return null;
    }
    public void addStudentToCourse(Course[] c, Student st, String cName) {
        if (findTheCourse(c, cName).addAStudent(st)) System.out.println("Added successfully");
        else System.out.println("No more room!");
    }
    public void dropStudentFromCourse(Course[] c, Student st, String cName) {
        if (findTheCourse(c, cName).removeAStudent(st)) System.out.println("Dropped successfully");
        else System.out.println("Removal failed");
    }
    public void printAllStudents(Course[] c) {
        ArrayList<Student> allStudents = new ArrayList<>();
        for (Course course : c) {
            for (Student student : course.getAllStudents()) {
                if (!allStudents.contains(student)) {
                    allStudents.add(student);
                }
            }
        }
        System.out.println(allStudents);
    }
    public void printBestStudent(Course[] c) {
        double max = 0;
        Student bestStudent = null;
        for (Course course : c) {
            for (Student student : course.getAllStudents()) {
                if (student.getGpa() > max) {
                    max = student.getGpa();
                    bestStudent = student;
                }
            }
        }
        System.out.println(bestStudent);
    }
}