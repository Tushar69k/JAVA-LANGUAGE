package PracticeWork.Progress.Arrays;

import java.util.*;

public class SubArray_ {
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
        Subarray(arr);


    }

    public static void Subarray(int[] arr) {
        System.out.println("\n Subarray :: ");
        for (int i = 0; i < arr.length; i++) {
            int Start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = Start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }


}