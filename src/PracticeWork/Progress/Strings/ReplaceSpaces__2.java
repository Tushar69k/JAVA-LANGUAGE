//Question : Program to replace Spaces with Underscores
package PracticeWork.Progress.Strings;

import java.util.Scanner;

public class ReplaceSpaces__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Enter any Text : ");
        String str = tush.nextLine();

        System.out.println("Replacing Spaces with Underscores in Text ::");
        str = str.replace(" ", "_");
        System.out.println(str);


    }
}
