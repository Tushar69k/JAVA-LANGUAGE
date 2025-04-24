package Exam.Done;

public class DynamicMethodDispatch {

    // Parent class
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class 1
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    // Child class 2
    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    // Main class

    public static void main(String[] args) {
        Animal a;  // Reference of superclass

        a = new Dog();  // Dog object
        a.sound();      // Calls Dog's version

        a = new Cat();  // Cat object
        a.sound();      // Calls Cat's version
    }


}
