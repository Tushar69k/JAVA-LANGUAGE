package PracticeWork.CodeWithHarry.Methods;

import java.util.*;

public class PatternReverse__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter No. for Pattern : ");
        int num = tush.nextInt();
        pattern(num);
    }

    static void pattern(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }


}

