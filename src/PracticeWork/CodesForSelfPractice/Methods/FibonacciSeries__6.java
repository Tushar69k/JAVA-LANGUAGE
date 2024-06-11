//Question : Function to print nth term of Fibonacci Series using Recursion
package PracticeWork.CodesForSelfPractice.Methods;

import java.util.*;

public class FibonacciSeries__6 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Count : ");
        int num = tush.nextInt();
        System.out.println("Fibonacci Series Upto " + num + " is :: ");
        FibonacciSeries(num);
    }

    static void FibonacciSeries(int count) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " " + n2);
        if (count == 1) {
            System.out.print(n1);
            return;
        }

        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }


    }
}
