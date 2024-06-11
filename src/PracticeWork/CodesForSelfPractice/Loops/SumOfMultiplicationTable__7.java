//Question : Program to calculate Sum of the numbers according in the Multiplication Table given by User
package PracticeWork.CodesForSelfPractice.Loops;

import java.util.*;

public class SumOfMultiplicationTable__7 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter Multiplication Table number to calculate Sum of numbers in Multiplication Table :  ");
        int num = tush.nextInt();

        int repo = num * 10;

        for (int i = 1; i <= repo; i++) { // convert i++ -> i+=num; & i = 0
            if (i % num == 0) { // this will be removed after above changes
                sum = sum + i;
//                System.out.println(i);
            }
        }

        System.out.println(" Sum of numbers in Multiplication Table of " + num + " is : " + sum);

    }
}
