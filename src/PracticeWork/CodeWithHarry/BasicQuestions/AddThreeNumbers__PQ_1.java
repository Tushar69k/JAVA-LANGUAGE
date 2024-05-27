// Question : Write program to add 3 numbers.

package PracticeWork;

import java.util.Scanner;

public class AddThreeNumbers__PQ_1 {
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
