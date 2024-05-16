package PracticeWork;

import java.util.Scanner;

public class SumOfEven_7 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER : ");
        int num = tush.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);


    }
}
