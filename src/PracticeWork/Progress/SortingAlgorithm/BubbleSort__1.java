package PracticeWork.Progress.SortingAlgorithm;

import java.util.*;

public class BubbleSort__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        int[] arr = Setarr();
        System.out.println();
        GetArr(arr);
        System.out.println();
        BubbleSortAscending(arr);
        BubbleSortDescending(arr);
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
            System.out.println("Element [" + (i + 1) + "] = " + arr[i]);
        }
    }


    static void BubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(" Bubble Sorted in Ascending Order :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }

    static void BubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(" Bubble Sorted in Descending Order :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }


}
