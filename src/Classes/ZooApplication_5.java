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
import java.util.Scanner;

public class ZooApplication_5 {
    public static void main(String[] args) {
        Food chicken = new Food("Chicken", 10);
        Food fish = new Food("Fish", 10);
        Food sugarCane = new Food("Sugar Cane", 10);
        Food[] arrayFood = {chicken, fish, sugarCane};

        Animal tiger = new Animal("Tiger", chicken);
        Animal leopard = new Animal("Leopard", chicken);
        Animal bear = new Animal("Bear", fish);
        Animal elephant = new Animal("Elephant", sugarCane);
        Animal[] arrayAnimal = {tiger, leopard, bear, elephant};

        ZooManager z = new ZooManager();

        Scanner in = new Scanner(System.in);
        int i = 0;
        while(!z.isFoodEmpty(arrayFood)) {
            System.out.println("Enter a number to feed an animal (0-3):");
            i = in.nextInt();
            z.feedAnimal(arrayAnimal[i], arrayFood);
        }
        System.out.println(arrayAnimal[i].typeOfFood);
    }
}

class Animal {
    String animalName;
    Food typeOfFood;
    
    public Animal(String animalName, Food typeOfFood) {this.animalName = animalName; this.typeOfFood = typeOfFood;}
    public String getName() {return animalName;}
    public Food getTypeOfFood() {return typeOfFood;}
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
    public ZooManager() {};
    
    public static void feedAnimal(Animal a, Food[] arrayFood) {
        for (Food f : arrayFood) if (a.typeOfFood == f) f.foodAmount--;
    }
    public static boolean isFoodEmpty(Food[] arrayFood) {
        for (Food f : arrayFood) if (f.foodAmount == 0) return true;
        return false;
    }
}