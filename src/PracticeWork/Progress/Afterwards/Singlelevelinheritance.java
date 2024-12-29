package PracticeWork.Progress.Afterwards;

import PracticeWork.Progress.Oops.Inheritance.SingleLevel;

import java.util.*;

public class Singlelevelinheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog d1 = new Dog();
        d1.legs = 4;
        d1.food = "Pedegree";
        d1.breed = "Labra";
        p
        System.out.println("Dogs has " + d1.legs + " Legs.");
        System.out.println("Dogs eats " + d1.food + ".");
        System.out.println("Dogs has " + d1.breed + " Breed.");
        System.out.print("Dogs Sounds like ");
        d1.Sound();
    }


    static class Animal {
        int legs;
        String food;
    }

    static class Dog extends Animal {
        String breed;

        void Sound() {
            System.out.println("Bhow Bhow!");
        }
    }

}