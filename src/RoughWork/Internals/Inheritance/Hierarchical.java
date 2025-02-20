package RoughWork.Internals.Inheritance;

import java.util.Scanner;

public class Hierarchical {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Fish Nemo = new Fish();
        Nemo.Swim();
        Nemo.Eats();
        Nemo.Breaths();

        System.out.println();
        Bird Red = new Bird();
        Red.Fly();
        Red.Eats();
        Red.Breaths();
    }

    static class Animal {
        void Eats() {
            System.out.println("Eating...");
        }

        void Breaths() {
            System.out.println("Breathing...");
        }
    }

    static class Fish extends Animal {
        void Swim() {
            System.out.println("Fish Swims...");
        }
    }

    static class Bird extends Animal {
        void Fly() {
            System.out.println("Bird Fly...");
        }

        // Animal Class is Hierarchical Inherited to Bird and Fish Class

    }


}
