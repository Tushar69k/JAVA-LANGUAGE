/* Question : Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the
answer. */
package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class Power_ {

    public static void main(String args[]) {
        System.out.println("Program to Calculate Square  :: ");
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = tush.nextInt();
        System.out.print("Enter Power of number : ");
        int power = tush.nextInt();
        int ans = 1;

        if (power == 0) {
            System.out.println("Power of " + num + " at " + power + " is : " + ans);


        } else {

            for (int i = 1; i <= power; i++) {
                ans = ans * num;
            }
            System.out.println("Power of " + num + " at " + power + " is : " + ans);
        }
    }


}
