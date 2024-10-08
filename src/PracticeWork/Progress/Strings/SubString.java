package PracticeWork.Progress.Strings;

import java.util.*;

public class SubString {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        System.out.println();
        System.out.println("Using SubString Function ::");
        System.out.println(SubString(str, 0, 5));
    }

    public static String SetString() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = tush.nextLine();
        return str;
    }

    public static void GetString(String str) {
        System.out.print("Entered String is : " + str);
    }

    public static String SubString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

}
