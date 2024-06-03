package PracticeWork.CodesForSelfPractice.Basics;

import java.util.Scanner;

public class GetInput_3 {
    public static void main(String[] args) {
        System.out.println("GETTING INPUT FROM THE USER --->");
        Scanner bhops = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int a = bhops.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int b = bhops.nextInt();
        int sum = a + b;
        System.out.println("THE SUM OF ABOVE BOTH THE NUMBERS IS : ");
        System.out.println(sum);
    }
}
