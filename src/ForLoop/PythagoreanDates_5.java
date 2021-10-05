/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoop;

/**
 *
 * @author cyrus.kell
 */
public class PythagoreanDates_5 {
    public static void main(String[] args) {
        for (int year = 0; year <= 20; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 30; day++) {
                    boolean a = day * day + month * month == year * year;
                    boolean b = day * day + year * year == month * month;
                    boolean c = month * month + year * year == day * day;
                    
                    if (a || b || c) {
                        if (month < 10) System.out.print("0");
                        System.out.print(month + "/");
                        if (day < 10) System.out.print("0");
                        System.out.print(day + "/");
                        if (year < 10) System.out.print("0");
                        System.out.println(year);
                    }
                    
                }
            }
        }
    }
}
