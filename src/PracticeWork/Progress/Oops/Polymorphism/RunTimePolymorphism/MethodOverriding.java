package PracticeWork.Progress.Oops.Polymorphism.RunTimePolymorphism;

import java.util.*;

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        Dog d = new Dog();
        d.eat();
    }

    static class Animal {
        void eat() {
            System.out.println("Animals Eat...");
        }
    }

    static class Dog extends Animal {
        void eat() { // This eat() Method will Override Animal eat() Method
            System.out.println("Dog Eat...");
        }
    }
}
