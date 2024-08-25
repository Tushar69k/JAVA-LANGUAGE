package PracticeWork.Progress.Oops.Abstraction;

import java.util.*;

public class AbstractionClass {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Horse h = new Horse();
        h.AnimalName();
        h.Walk();
        h.Eats();

    }

    static abstract class Animal { // Abstract Class Created

        void Eats() {
            System.out.println("This Animal Eats.");
        }

        abstract void AnimalName(); // Abstract Method Created

    }

    static class Horse extends Animal {


        void AnimalName() {
            System.out.println("This Animal is Horse.");
        }

        void Walk() {
            System.out.println("Horse Walks on 4 Legs.");
        }

    }

}
