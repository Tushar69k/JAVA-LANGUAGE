package PracticeWork.Progress.Arrays;

import java.util.*;

public class MaxSubarraySum_PrefixSum_ {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        int[] arr = Setarr();
        GetArr(arr);
        int[] res = PrefixSum(arr);
        ShowPrefixSum(res);
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
        System.out.print(" | ");
        System.out.println();
    }

    public static int[] PrefixSum(int[] arr) {
        int[] PrefixArr = new int[arr.length];
        PrefixArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            PrefixArr[i] = PrefixArr[i - 1] + arr[i];

        }

/* Eg  : 1 1 1 1 1
 1 2 3 4 5
 */

        return PrefixArr;
    }

    public static void ShowPrefixSum(int[] PrefixArr) {

        System.out.println(" Prefix Sum of Array is :: ");
        for (int i = 0; i < PrefixArr.length; i++) {
            System.out.print(" | " + PrefixArr[i]);
        }
        System.out.print(" | ");
    }
}