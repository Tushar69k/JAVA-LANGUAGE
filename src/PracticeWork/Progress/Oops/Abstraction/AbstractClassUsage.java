package PracticeWork.Progress.Oops.Abstraction;

public class AbstractClassUsage {
    /*
     A class which is declared with the abstract keyword is known as an abstract class in Java.
     It can have abstract and non-abstract methods (method with the body).
     The main motive of Abstract class is to Bind up all the Important methods and data members in a single class and then
     reuse them in child class.
    */
    static abstract class Animal {

        String name;

        String Ownername;

        void eat() { // non-abstract functions
            System.out.println("Animal Eats...");
        }

        /* Abstract methods can be declared in parent class but must be defined in child class else it  will show
         an error. */
        abstract void Lifespan();

        abstract void SetSpeed();

        abstract void SetName(String s);

        abstract void SetOwnerName(String v);
    }


    static class Horse extends Animal {

        void SetName(String s) {
            name = s;
            System.out.println("Our Horse Name is " + name);
        }

        void SetOwnerName(String v) {
            Ownername = v;
            System.out.println(name + "'s Owner Name is " + Ownername);
        }

        void Lifespan() {
            System.out.println(name + "'s Lifespan is of 30 Years :)");
        }

        void SetSpeed() {
            System.out.println(name + "'s Speed is 75 km/hr\n");
        }
    }


    static class Dog extends Animal {

        void SetName(String s) {
            name = s;
            System.out.println("Our Dog Name is " + name);
        }

        void SetOwnerName(String v) {
            Ownername = v;
            System.out.println(name + "'s Owner Name is " + Ownername);
        }

        void Lifespan() {
            System.out.println(name + "'s Lifespan is of 13 Years :)");
        }

        void SetSpeed() {
            System.out.println(name + "'s Speed is 40 km/hr");
        }
    }


    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.SetName("Badal");
        horse.SetOwnerName("Toofan");
        horse.Lifespan();
        horse.SetSpeed();


        Dog dog = new Dog();
        dog.SetName("Shiro");
        dog.SetOwnerName("Shinchan");
        dog.Lifespan();
        dog.SetSpeed();


    }


}
