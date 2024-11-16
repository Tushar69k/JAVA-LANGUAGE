package PracticeWork.Progress.Arrays.BasicArrayQuestions;

import java.util.*;

public class AdditionOfMatrix_ {
    public static void main(String[] args) {


        Scanner tush = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] sum = new int[2][3];

        System.out.println("Enter the element of 1st Matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = tush.nextInt();
            }
        }


        System.out.println("Enter the element of 2nd Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = tush.nextInt();
            }
        }


        System.out.println(" \n The element of 1st Matrix are  : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println(" \n The element of 2nd Matrix are  : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("\nThe sum of both Matrix is : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
