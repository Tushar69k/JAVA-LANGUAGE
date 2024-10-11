//Question : Program to replace Spaces with Underscores
package PracticeWork.Progress.Strings.StringQuestions;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter any Text : ");
        String str = tush.nextLine();

        System.out.println("Replacing Spaces with Underscores in Text ::");
        str = str.replace(" ", "_");
        System.out.println(str);


    }
}
