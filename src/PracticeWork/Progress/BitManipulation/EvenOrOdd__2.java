package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class EvenOrOdd__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        Checker();
    }

    static void Checker() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter the number you want to check is Even or Odd : ");
        int num = tush.nextInt();

        if ((num & 1) == 1) {
            System.out.println(num + " is Odd Number!");
        } else {
            System.out.println(num + " is Even Number!");
        }
    }

}
