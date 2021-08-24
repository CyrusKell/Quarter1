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

public class Add2Fractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first fraction:");
        Fraction fraction1 = new Fraction(sc.nextLine());
        System.out.println("Enter second fraction:");
        Fraction fraction2 = new Fraction(sc.nextLine());
        
        long combinedDenominator = fraction1.denominator() * fraction2.denominator();
        
        long mult1 = combinedDenominator/fraction1.denominator();
        long mult2 = combinedDenominator/fraction2.denominator();
        
        fraction1.numerator *= mult1;
        fraction2.numerator *= mult2;
        
        long combinedNumerator = fraction1.numerator() + fraction2.numerator();
        
        long gcd = getGCD(combinedNumerator, combinedDenominator);
        
        combinedNumerator /= gcd;
        combinedDenominator = combinedDenominator / gcd;
        
        System.out.println("");
        if (combinedDenominator == 1) {
            System.out.println("Result: " + combinedNumerator);
        } else {
            System.out.println("Result: " + combinedNumerator + "/" + combinedDenominator);
        }
        
    }
    
    public static long getGCD(long num1, long num2) {
        
        while (true) {
            if (num1 == num2) {
                break;
            }
            if (num1 > num2) {
                num1 -= num2;
            }
            if (num2 > num1) {
                num2 -= num1;
            }
        }
        
        return num1;
    }
}

class Fraction {
    public long numerator, denominator;
    
    public Fraction(String fraction) {
        int fractionBarIndex = fraction.indexOf("/");
        
        try {
            numerator = Long.parseLong(fraction.substring(0, fractionBarIndex));
            denominator = Long.parseLong(fraction.substring(fractionBarIndex + 1, fraction.length()));
            
            if (denominator == 0) {
                System.out.println("Error: Cannot divide by 0");
                System.exit(0);
            }
        }
        catch(NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error: Inputted value is not a valid fraction");
            System.exit(0);
        }
        
    }
    
    public long numerator() {
        return numerator;
    }
    
    public long denominator() {
        return denominator;
    }
        
}