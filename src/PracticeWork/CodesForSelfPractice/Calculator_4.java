package PracticeWork;

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
}
