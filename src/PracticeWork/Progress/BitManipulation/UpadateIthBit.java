package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class UpadateIthBit {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter i-th Position ( From Right to Left ): ");
        int i = tush.nextInt();
        System.out.print("Enter 1 or 0 to Update : ");
        int newbit = tush.nextInt();

        if (i == 1) {
            System.out.println("After Updating " + i + "st Bit in " + num + " by (" + newbit + ") : ");
        } else if (i == 2) {
            System.out.println("After Updating " + i + "nd Bit in " + num + " by (" + newbit + ") : ");
        } else if (i == 3) {
            System.out.println("After Updating " + i + "rd Bit in " + num + " by (" + newbit + ") : ");
        } else {
            System.out.println("After Updating " + i + "th Bit of " + num + " by (" + newbit + ") : ");
        }

        System.out.println("Number = " + Update(num, i, newbit));
        System.out.println("Updating using another Method ::");
        System.out.println("Number = " + Update2(num, i, newbit));
    }


    public static int Clear(int num, int i) {
        return num & (~(1 << i));
    }

    public static int Update(int num, int i, int newbit) {
        Clear(num, i);
        return num | newbit << i;
    }

    static int Set_ith_bit(int num, int i) {
        return num | 1 << i;
    }

    public static int Update2(int num, int i, int newbit) {
        if (newbit == 0) {
            return Clear(num, i);
        } else {
            return Set_ith_bit(num, i);
        }
    }

}
