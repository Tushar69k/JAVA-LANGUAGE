package PracticeWork.Progress.SortingAlgorithm;

import java.util.*;

public class CountingSort__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

//        int[] arr = Setarr();
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        GetArr(arr);
        SelectionSort(arr);
    }

    public static int[] Setarr() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = tush.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements of Array :: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + (i + 1) + "] : ");
            arr[i] = tush.nextInt();
        }
        return arr;
    }

    public static void GetArr(int[] arr) {
        System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");

    }

    public static void SelectionSort(int[] arr) {
        Scanner tush = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count = 0;

        int[] arr2 = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count = count + 1;
                }
                arr2[i] = count;
            }
            count = 0;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" | " + arr2[i]);
        }
        System.out.println(" | ");

        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (arr2[i] > 0) {
                arr[j] = i;
                j++;
                arr2[i]--;
            }
        }

        System.out.println(" Counting Sort :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }
}
