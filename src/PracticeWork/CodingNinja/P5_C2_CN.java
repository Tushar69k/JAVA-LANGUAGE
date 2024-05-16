/*
QUESTION : Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the
answer.
 */
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P5_C2_CN {

    public static void main(String args[]) {

        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num = tush.nextInt();
        System.out.println("ENTER THE POWER OF THE NUMBER : ");
        int power = tush.nextInt();
        int ans = 1;

        if (power == 0) {
            System.out.println(ans);
        } else {

            for (int i = 1; i <= power; i++) {
                ans = ans * num;
            }
            System.out.println("YOUR ANSWER IS : " + ans);
        }
        // Write code here


    }


}
