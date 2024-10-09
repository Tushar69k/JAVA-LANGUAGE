package PracticeWork.Progress.Strings;

import java.util.*;

public class LargestString {

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String[] fruits = {"apple", "mango", "strawberry", "banana", "dragonfruit"};

        System.out.print("Our String is : ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " , ");
        }
        System.out.print("etc.");
        System.out.println();


        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest String is : " + largest);
    }


}
