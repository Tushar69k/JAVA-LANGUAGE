package PracticeWork.Alpha.Arrays;

import java.util.*;

public class DSA__TrappingWater__10 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
//    System.out.print( " Enter Size of Graph : ");
//int size = tush.nextInt();
//int[] Arr = Setarr(size);
        int[] Arr = {4, 2, 0, 6, 3, 2, 5};
        GetArr(Arr);
        System.out.println();
        Graph(Arr);
    }

    public static int[] Setarr(int size) {
        Scanner tush = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter Elements For Traping Water :: ");

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

    static void Graph(int[] arr) {
        int Finale = 0;
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max <= arr[i]) {
                Max = arr[i]; // {4, 2, 0, 6, 3, 2, 5}
//                System.out.println(" The Maximum Elements Are : " + Max);
            }
            {
                int result = 0;

                if (arr[i] == Max) {
                    arr[i] = Max;
                } else if (i == arr.length - 1) {
                    result = 0;
                } else if (Max > arr[i]) {
                    result = Max - arr[i];
                } else if (Max < arr[i]) {
                    result = 0;
                    Max = arr[i];
                }

                System.out.println(" Trapping Water at Element [" + (i + 1) + "] is : " + result);
                Finale = Finale + result;
            }
        }
        System.out.println("\n The Total Trapping Water is : " + Finale);
    }
}
