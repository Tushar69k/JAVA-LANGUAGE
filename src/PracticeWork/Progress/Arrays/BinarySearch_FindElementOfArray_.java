package PracticeWork.Progress.Arrays;

import java.util.*;

public class BinarySearch_FindElementOfArray_ {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = tush.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "] = ");
            arr[i] = tush.nextInt();
        }

        System.out.println("Entered Elements are ::");
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + i + "] = " + arr[i]);
        }

        System.out.print("Enter the Element you want to find Index of : ");
        int find = tush.nextInt();

        System.out.println("The Index at " + find + " is : " + Binary(arr, find));

    }

    public static int Binary(int[] arr, int find) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == find) {
                return mid;
            }
            if (arr[mid] > find) {
                start = mid + 1;
            }
            if (arr[mid] < find) {
                end = mid - 1;
            }
            mid = find;
        }
        return -1;

    }

}

