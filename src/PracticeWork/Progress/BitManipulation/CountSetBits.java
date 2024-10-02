package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Count Set Bits of Number :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();

        System.out.println("\nUsing While Loop :");
        System.out.print("Number of Set Bits in " + num + " = ");
        System.out.println(CountSetBits(num));
        System.out.println("\nUsing For Loop :");
        System.out.print("Number of Set Bits in " + num + " = ");
        System.out.println(UsingForLoop(num));
    }

    public static int CountSetBits(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }

        return count;
    }

    public static int UsingForLoop(int num) {
        int count = 0;

        for (int i = num; i > 0; i = i >> 1) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}




