//Question : Program to sum first n Even numbers using While Loop .
package PracticeWork.Progress.Loops;

import java.util.*;

public class SumOfnEvenNumbers {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter number upto which you want sum of Even numbers : ");
        int num = tush.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(" The sum of Even numbers is : " + sum);


    }
}
