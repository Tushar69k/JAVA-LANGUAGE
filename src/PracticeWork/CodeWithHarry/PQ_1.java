package PracticeWork;

import java.util.Scanner;

/*
WRITE A PROGRAM TO SUM THREE NUMBERS IN JAVA
 */
public class PQ_1 {
    public static void main(String[] args) {
        System.out.println("PROGRAM TO ADD THREE NUMBERS ");
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER :");
        int a = tush.nextInt();
        System.out.println("ENTER SECOND NUMBER :");
        int b = tush.nextInt();
        System.out.println("ENTER THIRD NUMBER :");
        int c = tush.nextInt();
        int sum = a + b + c;
        System.out.println("THE SUM OF YOUR THREE NUMBERS IS : " + sum);

    }


}
