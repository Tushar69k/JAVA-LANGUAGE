package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class ClearRangeOfBits__8 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter i-th Position ( From Right ): ");
        int i = tush.nextInt();
        System.out.print("Enter j-th Position ( From Right ): ");
        int j = tush.nextInt();

        System.out.println("After Clearing Bits from index " + j + " to " + i + " : ");
        System.out.println("Number = " + ClearRange(num, i, j));
    }

    public static int Clear(int num, int i) {
        return num & (~(1 << i));
    }

    static int ClearRange(int num, int i, int j) {
        for (int o = i; o <= j; o++) {
            num = Clear(num, o);
        }
        return num;
    }

}
