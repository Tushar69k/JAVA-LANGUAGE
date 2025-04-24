package Exam.Done;

public class AbstractClassWithConstructor {

    // Abstract class
    static abstract class Animal {
        String name;

        // Constructor in abstract class
        Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor called");
        }

        // Abstract method
        abstract void makeSound();

        // Regular method
        void showName() {
            System.out.println("Animal's name: " + name);
        }
    }

    // Subclass
    static class Dog extends Animal {
        Dog(String name) {
            super(name);  // Calling constructor of abstract class
            System.out.println("Dog constructor called");
        }

        @Override
        void makeSound() {
            System.out.println(name + " says: Woof!");
        }
    }

    // Main class to test

    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.showName();
        d.makeSound();
    }
}





