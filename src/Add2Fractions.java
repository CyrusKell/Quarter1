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
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first fraction:");
        Fraction fraction1 = new Fraction(in.nextLine());
        System.out.println("Enter second fraction:");
        Fraction fraction2 = new Fraction(in.nextLine());
        
        long fraction1Numerator = fraction1.numerator() * fraction2.denominator();
        long fraction2Numerator = fraction2.numerator() * fraction1.denominator();
        
        long combinedDenominator = fraction1.denominator() * fraction2.denominator();
        
        long combinedNumerator = fraction1Numerator + fraction2Numerator;
        
        long gcd = getGCD(combinedNumerator, combinedDenominator);
        
        combinedNumerator /= gcd;
        combinedDenominator /= gcd;
        
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
    private long numerator, denominator;
    
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
            System.out.println("Error: Inputted value is not a valid fraction or is too large");
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
