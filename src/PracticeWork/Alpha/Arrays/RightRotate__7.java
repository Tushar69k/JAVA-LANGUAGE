package PracticeWork.Alpha.Arrays;

import java.util.*;

public class RightRotate__7 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = tush.nextInt();
        int[] arr = new int[size];


        for (int j = 0; j < arr.length; j++) {
            arr[j] = tush.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[j + 1];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(" element " + i + " : " + arr[i]);
        }


    }
}
