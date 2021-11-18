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
public class CompanyApp_3 {
    public static void main(String[] args) {
    Employee e1 = new Employee("George", "22", 100000, true);  
    Employee e2 = new Employee("John", "13", 75000, false);
    Employee e3 = new Employee("Antonio", "3", 95000, false);  
    Employee e4 = new Employee("Albert", "19", 85000, true);
    
    Employee[] emps = {e1,e2,e3,e4};
    Company myComp = new Company(emps);
    myComp.printAllEmployees();
    System.out.println(myComp.searchEmployee("3"));
    myComp.updateSalary();
}
}

class Employee {
    private String name, id;
    private int salary;
    private boolean bonus;
    
    public Employee(String name, String id, int salary, boolean bonus) {
        this.name = name;
        this.id =  id;
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public void setName(String a) {name = a;}
    public void setId(String a) {id = a;}
    public void setSalary(int a) {salary = a;}
    public void setBonus(boolean a) {bonus = a;}
    
    public String getName() {return name;}
    public String getId() {return id;}
    public int getSalary() {return salary;}
    public boolean getBonus() {return bonus;}
    public void computeSalary() {if (bonus) salary += 2000;}
    @Override
    public String toString() {return "Name: " + this.getName() + " Id: " + this.getId() + " Salary: " + this.getSalary();}
}

class Company {
    private final Employee[] employees;
    
    public Company(Employee[] e) {employees = e;}
    
    public void printAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    public Employee searchEmployee(String id) {
        for (Employee e : employees) if (e.getId().equals(id)) return e;
        return null;
    }
    public void updateSalary() {
        for (Employee e : employees) e.computeSalary();
    }
}

