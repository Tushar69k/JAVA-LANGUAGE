/*
QUESTION : Given a number N, print sum of all even numbers from 1 to N.
 */
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P3_C2_CN {

    public static void main(String args[]) {

        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER AS FAR AS YOU WANT SUM : ");
        int num = tush.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("THE SUM OF ALL EVEN NUMBERS FROM 1 TO N IS : " + sum);

    }


}
