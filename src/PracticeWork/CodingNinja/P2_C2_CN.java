/*
QUESTION : Write a program that takes three numbers a,b, and c as input and prints the largest number amongst them.
 */
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P2_C2_CN {

    public static void main(String args[]) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NUMBER : ");
        int a = tush.nextInt();
        System.out.println("ENTER YOUR SECOND NUMBER : ");
        int b = tush.nextInt();
        System.out.println("ENTER YOUR THIRD NUMBER : ");
        int c = tush.nextInt();

        if (a >= b && a >= c) {
            System.out.println("THE LARGEST NUMBER IS : " + a);
        } else if (b >= a && b >= c) {
            System.out.println("THE LARGEST NUMBER IS : " + b);
        } else if (c >= a && c >= b) {
            System.out.println("THE LARGEST NUMBER IS : " + c);
        }

    }

}
