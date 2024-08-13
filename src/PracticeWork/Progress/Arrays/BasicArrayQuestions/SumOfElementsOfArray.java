// Question : Create an Array of floats and calculate their sum.
package PracticeWork.Progress.Arrays.BasicArrayQuestions;

import java.util.*;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        float[] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        System.out.print("Enter the Size of the Array : ");
        int count = sc.nextInt();

        System.out.println("Enter the elements of Array :: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Element " + i + " : ");
            arr[i] = sc.nextFloat();
        }

        System.out.println("\n");
        System.out.println("Elements of Array are :: ");

        for (int i = 0; i < count; i++) {
            System.out.print(" Element " + i + " is : ");
            System.out.println(arr[i]);
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("\nThe sum fo Array will be : " + sum);


    }
}
