package PracticeWork;
/*
Write a program to calculate percentage of a given student in CBSE Board Exam . Take Marks of all 5 subjects from keyboard
 */


import java.util.Scanner;

public class PQ_Ch1_1 {


    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE STUDENT : ");
        String name = tush.nextLine();
        System.out.println("ENTER YOUR MARKS OF ALL THE SUBJECTS BELOW -------------------->");
        System.out.println("ENTER YOUR MARKS IN JAVA : ");
        int a = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN DSA : ");
        int b = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN FRENCH : ");
        int c = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN BDSM : ");
        int d = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN BAKCHODI : ");
        int e = tush.nextInt();


        int percentage = (a + b + c + d + e) / 5;
        System.out.println("SO THE MARKS OF ALL SUBJECTS OF " + name + " IS ----------->");
        System.out.println("MARKS IN JAVA : " + a);
        System.out.println("MARKS IN DSA : " + b);
        System.out.println("MARKS IN FRENCH : " + c);
        System.out.println("MARKS IN BDSM : " + d);
        System.out.println("MARKS IN BAKCHODI : " + e);

        System.out.println(" RESULT OF " + name + " IS ------->");
        System.out.println("SO THE PERCENTAGE OF THE STUDENT ACCORDING TO GIVEN INFORMATION IS : ");
        System.out.println(percentage + "%");


    }
}