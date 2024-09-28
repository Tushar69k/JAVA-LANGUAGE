package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class ClearIthBit {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter i-th Position ( From Right to Left ): ");
        int i = tush.nextInt();

        if (i == 1) {
            System.out.println("After Clearing " + i + "st Bit in " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Clearing " + i + "nd Bit in " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Clearing " + i + "rd Bit in " + num + " : ");
        } else {
            System.out.println("After Clearing " + i + "th Bit of " + num + " : ");
        }

        System.out.println("Number = " + Clear(num, i));
    }

    public static int Clear(int num, int i) {
        return num & (~(1 << i));
    }

}
