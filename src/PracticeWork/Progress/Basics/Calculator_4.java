package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class Calculator_4 {
    public static void main(String[] args) {
        System.out.println("Program for calculating Sum and Difference using switch statement :: ");
//        System.out.println("\t\t<------------ Welcome ------------->");
        Scanner bhops = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = bhops.nextInt();
        System.out.print("Enter second Number : ");
        int b = bhops.nextInt();
        int sum = a + b;
        int minus = a - b;
        System.out.println("\n:: Enter 1 for (+) and 2 for (-) ::");
        int cal = bhops.nextInt();

        switch (cal) {
            case 1:
                System.out.println(a + " + " + b + " = " + sum);
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + minus);
                break;
            default:
                System.out.println("PLease Re-Read User Manual . Thankyou! ");
        }
    }

    public static class AddThreeNumbers__PQ_1 {
        public static void main(String[] args) {
            System.out.println("PROGRAM TO ADD THREE NUMBERS ");
            Scanner tush = new Scanner(System.in);
            System.out.println("ENTER FIRST NUMBER :");
            int a = tush.nextInt();
            System.out.println("ENTER SECOND NUMBER :");
            int b = tush.nextInt();
            System.out.println("ENTER THIRD NUMBER :");
            int c = tush.nextInt();
            int sum = a + b + c;
            System.out.println("THE SUM OF YOUR THREE NUMBERS IS : " + sum);

        }


    }
}
