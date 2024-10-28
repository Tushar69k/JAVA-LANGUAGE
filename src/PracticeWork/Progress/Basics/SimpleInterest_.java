/*
QUESTION : Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
*/
package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class SimpleInterest_ {

    public static void main(String args[]) {
        System.out.println("Program to calculate Simple Interest :: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount (in Rs): ");
        int pa = sc.nextInt();
        System.out.print("Enter Rate of interest (%): ");
        float roi = sc.nextFloat();
        System.out.print("Enter Time period (in Years) : ");
        int tp = sc.nextInt();
        int si = (int) (pa * roi * tp) / 100;
        System.out.print("Your Simple Interest of " + pa + "rs for " + roi + "% for " + tp + " Years is : ");
        System.out.print(si);

    }
}






