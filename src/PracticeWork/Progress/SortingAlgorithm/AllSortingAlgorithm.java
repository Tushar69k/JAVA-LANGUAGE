package PracticeWork.Progress.SortingAlgorithm;

import java.util.*;

public class AllSortingAlgorithm {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

//        int[] arr = Setarr();
        int[] arr = {2, 7, 1, 0};
//        int[] arr = {5, 4, 1, 3, 2};
//        GetArr(arr);
//        BubbleSort(arr);
        SelectionSort(arr);
//        InsertionSort(arr);
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
//        System.out.println("Elements in Array Are :: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Element [" + (i + 1) + "] = " + arr[i]);
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");

    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorting through Bubble Sort :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }

    // Selection Sort
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            GetArr(arr);
        }
        System.out.println("\nSorting through Selection Sort :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }


    public static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
//                    arr[j] = space ;
                }
            }
            GetArr(arr);
        }
        System.out.println("\nSorting through Insertion Sort :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }


}
