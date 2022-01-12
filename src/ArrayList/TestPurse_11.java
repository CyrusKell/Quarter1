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
public class TestPurse_11 {
    public static void main(String[] args) {
        Purse a = new Purse();
        a.addCoin("Quarter");
        a.addCoin("Dime");
        a.addCoin("Nickel");
        a.addCoin("Penny");
        Purse b = new Purse();
        b.addCoin("Quarter");
        b.addCoin("Dime");
        b.addCoin("Nickel");
        b.addCoin("Penny");
        
        a.reverse();
        System.out.println(a);
        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(a.equals(b));
    }
}

class Purse {
    ArrayList<String> money = new ArrayList<String>();
    
    public void addCoin(String coinName) {money.add(coinName);}
    public String toString() {
        String output = "The content is: (";
        for (String coin : money) output+=" " + coin + ",";
        return output + " )";
    }
    public void reverse() {
        for (int i = 0; i < money.size();  i++) {
            money.add(i, money.get(money.size()-1));
            money.remove(money.size()-1);
        }
    }
    public double getValue() {
        double value = 0;
        for (String coin : money) {
            if (coin.equalsIgnoreCase("penny")) value += 0.01;
            if (coin.equalsIgnoreCase("nickel")) value += 0.05;
            if (coin.equalsIgnoreCase("dime")) value += 0.1;
            if (coin.equalsIgnoreCase("quarter")) value += 0.25;
        }
        value = Math.round(value * 100) / 100.0;
        return value;
    }
    public boolean equals(Purse purse) {
        if (this.getValue() == purse.getValue()) return true;
        return false;
    }
}
