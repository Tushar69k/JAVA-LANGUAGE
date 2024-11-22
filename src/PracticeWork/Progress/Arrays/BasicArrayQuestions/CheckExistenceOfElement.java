//Question : Write a program to find out whether a given integer is present in array or not .
package PracticeWork.Progress.Arrays.BasicArrayQuestions;

import java.util.*;

public class


CheckExistenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int flag = 0;

        System.out.println("Enter the elements of Array :: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

//        System.out.println("\n");
        System.out.println("Elements of Array are :: ");

        for (int i = 0; i < count; i++) {
            System.out.print("Element " + i + " is : ");
            System.out.println(arr[i]);
        }

        System.out.print("\nEnter the integer you have to check : ");
        int check = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (check == arr[i]) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("This Integer exists in the Array ");
        } else {
            System.out.println("This Integer does'nt exists in the Array ");
        }

    }


}



