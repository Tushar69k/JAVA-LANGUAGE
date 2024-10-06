package PracticeWork.Progress.SomeImpQuestions;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = tush.nextInt();
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

/*
Palindrome Program in Java
 151 --> Palindrome
 153 --> Not

    Logic ::
    rev = 0
    num = 151
    rem = num % 10 --> 151 % 10 = 1
    num /= 10 --> 151 / 10 = 15
    rev = (rev*10) + rem --> 0*10 + 1 = 1
    {Repeat this Until }

 num = 15
    rem = num % 10 --> 15 % 10 = 5
    num /= 10 --> 15 / 10 = 1
    rev = (rev*10) + rem --> 1*10 + 5 = 15

    num = 1
    rem = num % 10 --> 1 % 10 = 1
    num /= 10 --> 1 / 10 = 0
    rev = (rev*10) + rem --> 15*10 + 1
*/
