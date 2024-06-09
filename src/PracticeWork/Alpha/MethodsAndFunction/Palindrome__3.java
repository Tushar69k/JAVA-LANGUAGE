package PracticeWork.Alpha.MethodsAndFunction;

import java.util.*;

public class Palindrome__3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = tush.nextInt();
        Palindrome(num);


    }

    static void Palindrome(int num) {
        int reverse = 0, rem;
        int flag = 0;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + rem;

            if (reverse == temp) {
                flag = 1;
            }

        }
        System.out.print("The reversed number is :  " + reverse);

        if (flag == 1) {
            System.out.println("\nThe no. is Palindrome");
        } else {
            System.out.println("\nThe no. is not Palindrome");
        }


    }


}
