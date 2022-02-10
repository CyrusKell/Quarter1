/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author cyrus.kell
 */
public class BankTellerApplication_5 {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Customer c1 = new Customer("John", "1234 Playground St", "123-456-7890", 22);
        Customer c2 = new Customer("George", "9876 Field Av", "098-765-4321", 34);
        BankAccount a1 = new BankAccount(1234, c1, 200);
        SavingsAccount a2 = new SavingsAccount(5678, c2, 1000, 5);
        accounts.add(a1); accounts.add(a2);
        
        Scanner in = new Scanner(System.in);
        int i = 0;
        do {
            Teller.printMenu();
            i = in.nextInt();
            if (i == 1) accounts.add(Teller.createAccount(1));
            if (i == 2) accounts.add(Teller.createAccount(2));
            if (i == 3) {
                System.out.println("Enter account number:");
                int accountNumber = in.nextInt();
                System.out.println("Enter amount to deposit: ");
                Teller.findAccount(accounts, accountNumber).deposit(in.nextDouble());
            }
            if (i == 4) {
                System.out.println("Enter account number:");
                int accountNumber = in.nextInt();
                System.out.println("Enter amount to withdraw: ");
                Teller.findAccount(accounts, accountNumber).withdraw(in.nextDouble());
            }
            if (i == 5) {
                System.out.println("Enter account number:");
                ((SavingsAccount) (Teller.findAccount(accounts, in.nextInt()))).calculateInterest();
            }
            if (i == 6) {
                System.out.println("Enter account number:");
                System.out.println(Teller.findAccount(accounts, in.nextInt()));
            }
        } while (i != -1);
    }
}

class Customer {
    String name;
    String address;
    String phone;
    int age;
    public Customer(String name, String address, String phone, int age) {
        this.name = name; this.address = address; this.phone = phone; this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Age: " + age;
    }
}

class BankAccount {
    int accountNumber;
    Customer customer;
    double balance;
    public BankAccount(int accountNumber, Customer customer, int balance) {
        this.accountNumber = accountNumber; this.customer = customer; this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber  + " Balance: " + balance + " Customer: " + customer;
    }
    public void deposit(double amt) {
        balance += amt;
    }
    public void withdraw(double amt) {
        if (balance - amt >= 0) balance -= amt;
        else System.out.println("Not enough funds!");
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(int accountNumber, Customer customer, int balance, double interestRate) {
        super(accountNumber, customer, balance);
        this.interestRate = interestRate;
    }
    @Override
    public String toString() {
        return super.toString() + " Interest Rate: " + interestRate;
    }
    public void calculateInterest() {
        deposit(interestRate / 100 * balance);
    }
    @Override
    public void withdraw(double amt) {
        if (amt >= 1000) super.withdraw(amt);
        else System.out.println("Must withdraw at least $1,0000");
    }
}

class Teller {
    public static void printMenu() {        
         System.out.println("Enter "
                    + "1 to create a BankAccount, "
                    + "2 to create a SavingsAccount, "
                    + "3 to deposit, "
                    + "4 to withdraw, "
                    + "5 to calculateInterest, "
                    + "6 to print an account, "
                    + "or -1 to stop");
    }
    public static BankAccount createAccount(int accountType) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = in.nextInt();
        System.out.println("Enter account starting balance: ");
        int balance = in.nextInt();
        
        System.out.println("Enter customer name:");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Enter customer address:");
        String address = in.nextLine();
        System.out.println("Enter customer phone number:");
        String phone = in.nextLine();
        System.out.println("Enter customer age:");
        int age = in.nextInt();
        
        Customer customer = new Customer(name, address, phone, age);
        if (accountType == 2) {
            System.out.println("Enter interest rate:");
            double interestRate = in.nextDouble();
            return new SavingsAccount(accountNumber, customer, balance, interestRate);
        }
        return new BankAccount(accountNumber, customer, balance);
    }
    
    public static BankAccount findAccount(ArrayList<BankAccount> list, int accountNum) {
        for (BankAccount account : list) if (account.getAccountNumber() == accountNum) return account;
        return null;
    }
}
