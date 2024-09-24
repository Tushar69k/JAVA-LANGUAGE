package PracticeWork.Progress.Arrays;

import java.util.*;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = Setarr();
        GetArr(arr);
        Subarray(arr);
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
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    static void Subarray(int[] arr) {
        int maxsum = arr[0];
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currsum = currsum + arr[k];
                    System.out.print(arr[k] + " ");
                    if (maxsum < currsum) {
                        maxsum = currsum;
                    }
                }
                System.out.println();
            }
            System.out.println(" Sum of " + (i + 1) + " Iteration is : " + currsum + " \n ");
            currsum = 0;
        }
//        System.out.println(currsum);
        System.out.println(" The Maximum Sum among all groups is :  " + maxsum);
    }


}
