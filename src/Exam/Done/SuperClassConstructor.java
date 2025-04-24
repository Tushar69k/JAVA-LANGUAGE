package Exam.Done;

public class SuperClassConstructor {

    // Superclass
    static class Animal {
        String name;

        // Constructor
        Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor called");
        }

        void sound() {
            System.out.println(name + " makes a sound.");
        }
    }

    // Subclass
    static class Dog extends Animal {

        // Constructor
        Dog(String name) {
            super(name);  // Call superclass constructor
            System.out.println("Dog constructor called");
        }

        void display() {
            super.sound();  // Call superclass method
            System.out.println("This is a dog.");
        }
    }

    // Main class to run the program

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
    }


}
