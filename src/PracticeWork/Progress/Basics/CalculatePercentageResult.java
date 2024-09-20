package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class CalculatePercentageResult {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("\nProgram to Calculate (%) ::");
        System.out.print("Enter Name of Student : ");
        String name = tush.nextLine();
        System.out.println("\nHey " + name + "! Please enter your marks (out of 100) in Subjects given below :: ");
        System.out.print("Enter marks of C : ");
        int a = tush.nextInt();
        System.out.print("Enter marks of Cpp : ");
        int b = tush.nextInt();
        System.out.print("Enter marks of Java : ");
        int c = tush.nextInt();
        System.out.print("Enter marks of WebDev : ");
        int d = tush.nextInt();
        System.out.print("Enter marks of Kotlin : ");
        int e = tush.nextInt();


        int percentage = ((a + b + c + d + e) / 5);
        System.out.println("\nMarks in all Subjects of " + name + " is given below :: ");
        System.out.println("Marks in C : " + a);
        System.out.println("Marks in Cpp : " + b);
        System.out.println("Marks in Java : " + c);
        System.out.println("Marks in WebDev : " + d);
        System.out.println("Marks in Kotilnln : " + e);

        System.out.print("\n % of " + name + " according to given information is : ");
        System.out.print(percentage + "%");


    }
}