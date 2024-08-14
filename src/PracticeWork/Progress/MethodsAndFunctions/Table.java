//Question : Program to print MUltiplication Table of a number n .
package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Multiplication Table Number : ");
        int num = tush.nextInt();
        table(num);
    }

    static void table(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }


}

