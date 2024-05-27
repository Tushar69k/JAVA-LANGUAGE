package PracticeWork.CodeWithHarry.Loops;

import java.util.*;

public class Factorial__6 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter number for Factorial : ");
        int num = tush.nextInt();
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("The Factorial of " + num + " is : " + fact);

    }
}

/*
    Factorial Number Program in Java
    num! = num * (num-1) * (num-2) * ... 2 * 1
*/
