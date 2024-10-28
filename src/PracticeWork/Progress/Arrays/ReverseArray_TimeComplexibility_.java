package PracticeWork.Progress.Arrays;

import java.util.*;


public class ReverseArray_TimeComplexibility_ {
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

        System.out.println("Reversed Array :: ");
        Reverse(arr);
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + (i + 1) + "] : " + arr[i]);
        }
    }

    static void Reverse(int[] arr) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

    }


}
