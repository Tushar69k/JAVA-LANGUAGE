//Question : Program to find the type of Website from url
package PracticeWork.CodeWithHarry.Conditionals;

import java.util.*;

public class FIndTypeOfWebsite__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Website : ");
        String website = tush.next();

        if (website.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        }
        if (website.endsWith(".org")) {
            System.out.println("This is an Organization Website");
        }
        if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }

    }
}
