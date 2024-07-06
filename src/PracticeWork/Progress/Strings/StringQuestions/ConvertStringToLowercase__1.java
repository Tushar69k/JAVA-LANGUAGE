//Question : Program to convert a String to UpperCase and LowerCase
package PracticeWork.Progress.Strings.StringQuestions;

import java.util.*;

public class ConvertStringToLowercase__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Program to convert String to Uppercase and lowercase :: ");

        System.out.println("Enter any String : ");
        String str = tush.nextLine();
        str = str.toUpperCase();

        System.out.println(" Your String in UpperCase : " + str);

        str = str.toLowerCase();

        System.out.println("Your String in LowerCase : " + str);
    }

}
