package PracticeWork.Progress.SomeImpQuestions;

import java.util.Scanner;

public class Power_ {


    public static void main(String args[]) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = tush.nextInt();
        System.out.print("Enter Power of Number : ");
        int power = tush.nextInt();
        int ans = 1;

        if (power == 0) {
            System.out.println(ans);
        } else {

            for (int i = 1; i <= power; i++) {
                ans = ans * num;
            }
            System.out.println("The Power of " + num + " at " + power + " is : " + ans);
        }
        // Write code here

    }
}

