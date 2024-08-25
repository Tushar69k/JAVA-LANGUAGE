package PracticeWork.Progress.Oops.Abstraction;

import java.util.*;

public class AbstractionClassConstructor {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Mustang h = new Mustang();

    }

    static abstract class Animal { // Abstract Class Created

        Animal() { // Constructor Created
            System.out.println("Animal Constructor Called.");
        }

        abstract void AnimalName(); // Abstract Method Created

    }


    static class Horse extends Animal {

        Horse() { // Constructor Created
            System.out.println("Horse Constructor Called.");
        }

        void AnimalName() {
            System.out.println("This Animal is Horse.");
        }

    }


    static class Mustang extends Horse {

        Mustang() { // Constructor Created
            System.out.println("Mustang Constructor Called.");
        }

    }

}
