package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class SumOfDigits__13 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = tush.nextInt();

        System.out.println(" The sum of Digits of no. " + num + " is : " + Sum(num));
    }

    static int Sum(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        return sum;
    }


}
