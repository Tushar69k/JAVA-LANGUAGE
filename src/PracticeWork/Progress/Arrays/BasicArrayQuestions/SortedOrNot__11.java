// Question : Find whether an array is Sorted or not
// NOTE : Sorted means elements are in ascending order

package PracticeWork.Progress.Arrays.BasicArrayQuestions;

import java.util.*;

public class SortedOrNot__11 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Enter the length of Array : ");
        int length = tush.nextInt();

        int[] arr = new int[length];

        System.out.println("\nEnter Elements of Array ::");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = tush.nextInt();
        }

        System.out.println("\nElements of Array are ::");
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }

        int flag = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag = 1;
                break;
            }
        }


        if (flag == 1) {
            System.out.println("\n <-----Array is Sorted-----> ");
        } else {
            System.out.println("<-----Array is not Sorted-----> ");
        }

    }
}
