package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class CheckPowerOfTwo__9 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Program to Clear ith Bit :: ");
        System.out.print("Enter Number To be checked : ");
        int num = tush.nextInt();

        if (Check(num)) {
            System.out.println(num + " is Power of 2 !");
        } else System.out.println(num + " is not Power of 2 !");

    }


    public static boolean Check(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
