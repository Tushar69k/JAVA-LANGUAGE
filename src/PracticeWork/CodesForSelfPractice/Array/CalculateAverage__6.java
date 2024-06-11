//Question : Calculate the Average marks from an Array containing marks of all students in Physics for each loop .
package PracticeWork.CodesForSelfPractice.Array;

import java.util.*;

@SuppressWarnings("DataFlowIssue")
public class CalculateAverage__6 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter the number of students in Class : ");
        int num = tush.nextInt();

        int[] arr = new int[num];

        System.out.println("\nEnter the Marks of Students in Physics ( Out of 50 ) :: \n");

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Marks of Student " + (i + 1) + " : ");
            arr[i] = tush.nextInt();
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
