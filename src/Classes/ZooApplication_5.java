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
public class ZooApplication_5 {
    
}

class Animal {
    String animalName;
    String typeOfFood;
    
    public Animal(String animalName, String typeOfFood) {this.animalName = animalName; this.typeOfFood = typeOfFood;}
    public String getName() {return animalName;}
    public String getTypeOfFood() {return typeOfFood;}
    @Override
    public String toString() {return "Animal Name: " + animalName + " Type Of Food " + typeOfFood;}
}

class Food {
    String foodName;
    int foodAmount;
    
    public Food(String name, int amount) {foodName = name; foodAmount = amount;}
    public String getFoodName() {return foodName;}
    public int getFoodAmount() {return foodAmount;}
    public void decreaseAmount() {foodAmount -= 1;}
    @Override
    public String toString() {return "Food Name: " + foodName + " Food Amount: " + foodAmount;}
}

class ZooManager {
    public static void feedAnimal(Animal a, Food[] arrayFood) {
        
    }
}