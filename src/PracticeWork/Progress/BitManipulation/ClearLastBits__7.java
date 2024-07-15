package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class ClearLastBits__7 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter Index of Bit from Upto you want to Clear all bits ( From Right to Left ) : ");
        int i = tush.nextInt();
        Clearuptolast(num, i);

        if (i == 1) {
            System.out.println("After Clearing from " + i + "st Bit in " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Clearing from " + i + "nd Bit in " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Clearing from " + i + "rd Bit in " + num + " : ");
        } else {
            System.out.println("After Clearing from " + i + "th Bit of " + num + " : ");
        }

        System.out.println("Resultant Number = " + Clearuptolast(num, i));
    }


    public static int Clear(int num, int i) {
        return num & (~(1 << i));
    }

    public static int Clearuptolast(int num, int i) {
        for (int j = 0; j <= i; j++) {
            num = Clear(num, j);
        }
        return num;
    }
}
