package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class GetithBit__3 {
    public static void main(String[] args) {
        Getithterm();
    }

    public static void Getithterm() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = tush.nextInt();
        System.out.print("Enter ith term : ");
        int i = tush.nextInt();

        int leftSwift = 1 << i;

        if ((num & leftSwift) == 0) {
            System.out.println("Number at " + i + " ith index of " + num + " is 0");
        } else {
            System.out.println("Number at " + i + " ith index of " + num + " is 1");
        }
    }
}
