//Question : Program to find the Day by Number of day
package PracticeWork.CodesForSelfPractice.Conditionals;

import java.util.*;

public class DaySwitch__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter the number of Day : ");
        int day = tush.nextInt();


        switch (day) {
            case 1 -> System.out.println("The day is Monday");
            case 2 -> System.out.println("The day is Tuesday");
            case 3 -> System.out.println("The day is Wednesday");
            case 4 -> System.out.println("The day is Thursday");
            case 5 -> System.out.println("The day is Friday");
            case 6 -> System.out.println("The day is Saturday");
            case 7 -> System.out.println("The day is Sunday");
            default -> System.out.println(" Brother , There are only 7 days in a week, Which day have you written?");


        }


    }
}
