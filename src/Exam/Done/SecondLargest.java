package Exam.Done;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Setarr();
        GetArr(arr);
        SecondLargest(arr);
    }


    public static int[] Setarr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements in Your Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr [" + (i + 1) + "] : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void GetArr(int[] arr) {
        System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element [" + (i + 1) + "] = " + arr[i]);
        }
    }

    public static void SecondLargest(int[] arr) {

        int largest = 0;
        int secondlargest = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[secondlargest] < arr[i] && i != largest) {
                secondlargest = i;
            }
        }

        System.out.println("Largest Array : " + arr[largest]);
        System.out.println("Second Largest Array : " + arr[secondlargest]);

    }
}
