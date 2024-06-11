package PracticeWork.CodesForSelfPractice.Basics;

import java.util.Scanner;

public class Calculator_4 {
    public static void main(String[] args) {
        System.out.println("SWAGAT VANDAN ABHINANDAN");
        Scanner bhops = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER WITH WHICH YOU WANT TO PERFORM ARITHMETIC OPERATIONS : ");
        int a = bhops.nextInt();
        System.out.println("ENTER SECOND NUMBER WITH WHICH YOU WANT TO PERFORM ARITHMETIC OPERATIONS : ");
        int b = bhops.nextInt();
        int sum = a + b;
        int minus = a - b;
        System.out.println("<-----ENTER 1 FOR SUM WHEREAS 2 FOR MINUS----->");
        int cal = bhops.nextInt();

        switch (cal) {
            case 1:
                System.out.println(sum);
                break;

            case 2:
                System.out.println(minus);
                break;
            default:
                System.out.println("CHAL CHAL KE DIKHA ");
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
