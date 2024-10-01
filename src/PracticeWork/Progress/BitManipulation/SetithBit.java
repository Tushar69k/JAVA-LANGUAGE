package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class SetithBit {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter i-th Position ( From Right to Left ): ");
        int i = tush.nextInt();

        if (i == 1) {
            System.out.println("After Setting " + i + "st Bit in " + num + " : ");
        } else if (i == 2) {
            System.out.println("After Setting " + i + "nd Bit in " + num + " : ");
        } else if (i == 3) {
            System.out.println("After Setting " + i + "rd Bit in " + num + " : ");
        } else {
            System.out.println(i + "th Bit of " + num + " = ");
        }
        System.out.println("Num = " + Set_ith_bit(num, i));

    }

    static int Set_ith_bit(int num, int i) {
        return num | 1 << i;
    }
}
