//Question : Write a program to find out whether a given integer is present in array or not .
package PracticeWork.CodesForSelfPractice.ARRAYS;

import java.util.*;

public class FIndAnIntegerIArray__5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the elements of Array :: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n");
        System.out.println("Elements of Array are :: ");

        for (int i = 0; i < count; i++) {
            System.out.print(" Element " + i + " is : ");
            System.out.println(arr[i]);
        }

        System.out.print("Enter the integer you have to check : ");
        int bhopu = sc.nextInt();


    }


}
