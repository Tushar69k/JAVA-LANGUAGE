package PracticeWork.Progress.Patterns;

import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = tush.nextInt();

        System.out.println("Star Pattern :: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println(" Reversed Star Pattern ::");
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }


}
