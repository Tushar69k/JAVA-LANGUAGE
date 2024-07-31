//Question : Program for Fibonacci Series
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233

package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class FibonaccinthTerm {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter nth Term : ");
        int num = tush.nextInt();
        System.out.print("Fibonacci Series at " + num + "th term is ::");
        FibonacciSeries(num);
    }

    static void FibonacciSeries(int count) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        if (count == 1 || count == 2) {
            System.out.println(n2);
            return;
        }

        if (count == 0) {
            System.out.println(n1);
        }

        for (int i = 1; i < count; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.print(" " + n3);
    }


}
