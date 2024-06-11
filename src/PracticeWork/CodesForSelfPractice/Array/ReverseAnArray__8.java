//Question : Write a program to Reverse an array.

package PracticeWork.CodesForSelfPractice.Array;
import java.util.*;


public class ReverseAnArray__8 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter the length of Array : ");
        int arrLength = tush.nextInt();

        int[] arr = new int[arrLength];

        System.out.println(" \n Enter Elements of Array : ");
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = tush.nextInt();
        }

        System.out.println(" \n Your Array Elements are :: ");
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr[i]);
        }

        System.out.println("\n\n Reversing Array :: ");

        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }


        for (int i = 0; i < l; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr[i]);
        }


    }
}
