/*Question : Program to fill in a letter Template which looks  like below :
 letter = " Dear <!name!> , Wishing you a bright and prosperous future. ";
        Replace <!name!> with a string*/

package PracticeWork.Progress.Strings.StringQuestions;

import java.util.Scanner;

public class FillLetterTemplate {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Our String is ::");

        String letter = " Dear <!name!> , Wishing you a bright and prosperous future.\n ";

        System.out.print(letter);

        System.out.print("Enter your Name : ");
        String name = tush.next();

        System.out.println("\n Replacing <!name!> with your Name :: ");

        letter = letter.replace("<!name!>", name);
        System.out.println(letter);


    }
}
