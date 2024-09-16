package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        System.out.println("Getting Input from user :: ");
        Scanner bhops = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = bhops.nextInt();
        System.out.print("Enter Second number : ");
        int b = bhops.nextInt();
        int sum = a + b;
        System.out.print("Sum of above both the Numbers is : ");
        System.out.print(sum);
    }
}
