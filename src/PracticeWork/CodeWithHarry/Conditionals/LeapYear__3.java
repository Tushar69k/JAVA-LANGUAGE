//Question : Program to find whether a Year entered is Leap year or not
package PracticeWork.CodeWithHarry.Conditionals;

import java.util.*;

public class LeapYear__3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter the Year you have to check : ");
        int year = tush.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 1) {
            System.out.println("The Year " + year + " is Leap Year ");
        } else {
            System.out.println("The Year " + year + " is not a Leap Year");
        }


    }
}
