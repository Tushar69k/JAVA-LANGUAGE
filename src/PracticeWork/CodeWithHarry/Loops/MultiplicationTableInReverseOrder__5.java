package PracticeWork.CodeWithHarry.Loops;

import java.util.*;

public class MultiplicationTableInReverseOrder__5 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Enter number whose Multiplication Table you want : ");
        int num = tush.nextInt();

        System.out.println("\n The Multiplication Table for " + num + " is ::");

        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " * " + i + " = " + num * i);
        }


    }
}
