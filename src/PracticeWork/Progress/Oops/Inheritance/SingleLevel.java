package PracticeWork.Progress.Oops.Inheritance;

import java.util.*;

public class SingleLevel {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        Dogs d1 = new Dogs();
        d1.legs = 4;
        d1.food = "Pedegree";
        d1.breed = "Labra";

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

    static class Dogs extends Animal {  // Dog Class is Single Level Inherited by Animal Class
        String breed;

        void Sound() {
            System.out.println("Bhow Bhow!");
        }
    }
}
