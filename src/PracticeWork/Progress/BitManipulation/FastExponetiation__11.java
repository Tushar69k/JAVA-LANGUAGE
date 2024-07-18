package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class FastExponetiation__11 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Program to Check Exponential (Fast Method) :: ");
        System.out.print("Enter Any Number : ");
        int num = tush.nextInt();
        System.out.print("Enter Power of Number : ");
        int pow = tush.nextInt();

        System.out.print(num + " to the power of " + pow + " = ");
        System.out.println(FastExpo(num, pow));
    }


    public static int FastExpo(int num, int pow) {
//        System.out.println("Program to Check Exponential (Fast Method) :: ");
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = ans * num;
            }
            num *= num;
            pow = pow >> 1;
        }
        return ans;
    }
}