/*
QUESTION : Write a program that takes three numbers a,b, and c as input and prints the largest number amongst them.
 */
package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class LargestNumberAmong3Numbers__8 {

    public static void main(String args[]) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Calculate lagrest number :: ");
        System.out.print("Enter First Number : ");
        int a = tush.nextInt();
        System.out.print("Enter Second Number : ");
        int b = tush.nextInt();
        System.out.print("Enter Third Number : ");
        int c = tush.nextInt();
        System.out.println();
        if (a >= b && a >= c) {
            System.out.println("Largest Number among " + a + " , " + b + " and " + c + " is : " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number among " + a + " , " + b + " and " + c + " is : " + b);
        } else if (c >= a && c >= b) {
            System.out.println("Largest Number among " + a + " , " + b + " and " + c + " is : " + c);
        }

    }

}
