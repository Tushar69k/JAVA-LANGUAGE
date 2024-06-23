package PracticeWork.Progress.Arrays;

import java.util.*;

public class KadanesTheorem__8 {

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        int[] arr = Setarr();
        GetArr(arr);
        int[] res = Kadane(arr);
        ShowKadane(res);
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

    public static int[] Kadane(int[] arr) {
        int[] KadaneArr = new int[arr.length];

        if (arr[0] > 0) {
            KadaneArr[0] = arr[0];
        } else {
            KadaneArr[0] = 0;
        }

        for (int i = 1; i < arr.length; i++) {
            KadaneArr[i] = KadaneArr[i - 1] + arr[i];
            if (KadaneArr[i] < 0) {
                KadaneArr[i] = 0;
            }
        }
 /*
 For Example :
 Size of Array = 7
         -2 -1  4  5 -6  10 -12
          0  0  4  9  3  13  1
  */

        return KadaneArr;
    }

    public static void ShowKadane(int[] PrefixArr) {

        System.out.println(" Kadane Sum of Array is :: ");
        for (int i = 0; i < PrefixArr.length; i++) {
            System.out.print(" | " + PrefixArr[i]);
        }
        System.out.print(" | ");


    }
}

