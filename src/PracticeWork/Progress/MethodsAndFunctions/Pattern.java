//Question : Program using Functions to print Multiplication Table
package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter No. for Pattern : ");
        int num = tush.nextInt();
        pattern(num);
    }

    static void pattern(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }


}
