package PracticeWork.SomeExtraCodes;

import java.util.Scanner;

public class power {


    public static void main(String args[]) {
        Scanner tush = new Scanner(System.in);

        int num = tush.nextInt();
        int power = tush.nextInt();
        int ans = 1;

        if (power == 0) {
            System.out.println(ans);
        } else {

            for (int i = 1; i <= power; i++) {
                ans = ans * num;
            }
            System.out.println(ans);
        }
        // Write code here

    }
}

