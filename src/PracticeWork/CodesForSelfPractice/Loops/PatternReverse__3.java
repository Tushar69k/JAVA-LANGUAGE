package PracticeWork.CodesForSelfPractice.Loops;

import java.util.*;

public class PatternReverse__3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = tush.nextInt();

        for (int i = num; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }


    }
}
