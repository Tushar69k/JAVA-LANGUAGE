package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class SumOfEvenAndOdd_6 {
    public static void main(String[] args) {
        System.out.println("\nProgram to calculate Sum of Even and Odd Numbers :: ");
//        System.out.println();
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter no. Upto you want Sum for Even and Odd number : ");
        int num = tush.nextInt();
        System.out.println("\n For Even Numbers :: ");
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(sum);
                sum = sum + i;
                System.out.println(" + " + i + " = " + sum);
            }
        }
        System.out.println("Sum upto " + num + " for Even numbers is :: " + sum);
        System.out.println();
        System.out.println(" For Odd Numbers : ");
        sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(sum);
                sum = sum + i;
                System.out.println(" + " + i + " = " + sum);
            }
        }
        System.out.println("Sum upto " + num + " for Odd numbers is : " + sum);

    }
}
