package Exam.Done;

public class mimi {

    interface Flyaable {

        void fly();

        default void status() {
            System.out.println("Flyaable Activated");
        }

    }

    interface Swimmable {

        void swim();

        default void status() {
            System.out.println("Swimmable Activated");
        }

    }

    static class Duck implements Flyaable, Swimmable {

        public void fly() {
            System.out.println("Duck can FLy");
        }

        public void swim() {
            System.out.println("Duck can Swim");
        }

        public void status() {
            System.out.println("Duck can Swim and Fly");
            Flyaable.super.status();
            Swimmable.super.status();
        }

    }


    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
        d.status();
    }

}
