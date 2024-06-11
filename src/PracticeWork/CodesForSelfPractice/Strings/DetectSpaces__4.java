//Question : Program to Detect double and triple Spaces in String
package PracticeWork.CodesForSelfPractice.Strings;

import java.util.*;

public class DetectSpaces__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = tush.nextLine();

        System.out.println(" Index of single Spaces is : " + str.indexOf(" "));
        System.out.println(" Index of double Spaces is : " + str.indexOf("  "));


    }
}
