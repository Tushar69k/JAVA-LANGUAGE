package PracticeWork.Progress.Afterwards;

import java.util.*;

public class ahuhu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Setarr();
        Getarr(arr);
    }

    public static int[] Setarr() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Arr : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void Getarr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
