package PracticeWork.Alpha.Arrays;

import java.util.*;

public class PairsOfArray__3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = tush.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements of Array :: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + (i + 1) + "] : ");
            arr[i] = tush.nextInt();
        }

        System.out.println(" Entered Elements of Array are :: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + (i + 1) + "] : " + arr[i]);
        }

        Pair(arr);
    }

    public static void Pair(int[] arr) {
        System.out.println("Pairs of Elements :: ");
        for (int i = 0; i < arr.length; i++) {
            int Current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + Current + " , " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

}
