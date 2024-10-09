package PracticeWork.Progress.Strings;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Program to check String is Palindrome or Not :: ");
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = tush.nextLine();
        Reverse(str);
        Palindrome(str);
    }

    public static void Palindrome(String str) {
        int n = str.length();
        int flag = 0;
        for (int i = 0; i < (n / 2); i++) {
            if (str.charAt(i) == str.charAt(n - i - 1)) {
                flag = 1;
            }
        }

        if (flag != 1) {
            System.out.println("String is not Palindrome.");
        } else if (flag == 1) {
            System.out.println("String is Palindrome!");
        }
    }


    public static void Reverse(String str) {
        String temp = " ";
        int n = str.length();
        char ch;
        for (int i = n - 1; i >= 0; i--) {
            ch = str.charAt(i);
            temp += ch;
        }
        System.out.println("Reversed String :" + temp);
    }

}
