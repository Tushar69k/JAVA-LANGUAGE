//Question : Program to find Smallest element .

package PracticeWork.CodeWithHarry.Arrays;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Enter the length of Array : ");
        int l = tush.nextInt();

        int[] arr = new int[l];

        System.out.println("Enter the elements of Array :: ");
        for (int i = 0; i < l; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = tush.nextInt();
        }

        System.out.println("\n Array Elements are :: ");
        for (int i = 0; i < l; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }

        int min = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }


        System.out.println("\n The Smallest element in Array is : " + min);

    }
}




