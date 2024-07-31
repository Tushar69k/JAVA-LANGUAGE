//Question : Find Average of 3 Numbers
package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class AverageOfNum {
    static Scanner tush = new Scanner(System.in);
    static int Num1, Num2, Num3;

    public static void GetNum() {
        System.out.print("Enter 1st Number : ");
        Num1 = tush.nextInt();
        System.out.print("Enter 2nd Number : ");
        Num2 = tush.nextInt();
        System.out.print("Enter 3rd Number : ");
        Num3 = tush.nextInt();
    }

    public static int Averagee() {
        return (Num3 + Num2 + Num1) / 3;
    }

    public static void main(String[] args) {
        GetNum();
        System.out.println("The Average of Numbers " + Num1 + " , " + Num2 + " , " + Num3 + " is : " + Averagee());
    }
}
