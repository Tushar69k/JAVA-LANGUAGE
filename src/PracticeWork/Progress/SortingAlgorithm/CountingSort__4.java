package PracticeWork.Progress.SortingAlgorithm;

import java.util.*;

public class CountingSort__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        int[] arr = Setarr();
        GetArr(arr);
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
}
