package RoughWork.Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of student to calculate average : ");
        int num = sc.nextInt();

        int arr[] = new int[num];


        System.out.println("\nEnter the Marks of Students in Physics ( Out of 50 ) :: \n");

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Marks of Student " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n");
        System.out.println("The Marks of Students are :: ");

        for (int i = 0; i < num; i++) {
            System.out.println("The Marks of Student " + (i + 1) + " is : " + arr[i]);
        }

        int sum = 0;
        int average = 0;

        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        average = sum / num;

        System.out.println("\nThe average of Physics Marks in Class of " + num + " Students is : " + average);


    }


}
