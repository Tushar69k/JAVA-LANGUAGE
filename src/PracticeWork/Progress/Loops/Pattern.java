package PracticeWork.Progress.Loops;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int num = tush.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }


    }
}
