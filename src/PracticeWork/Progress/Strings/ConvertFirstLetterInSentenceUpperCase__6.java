package PracticeWork.Progress.Strings;

import java.util.*;

public class ConvertFirstLetterInSentenceUpperCase__6 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        UpperCase(str);
    }

    public static String SetString() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = tush.nextLine();
        return str;
    }

    public static void GetString(String str) {
        System.out.print("Entered String is : " + str);
        System.out.println();
    }


    public static void UpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println("Your String Converted to UpperCAse letter :: " + sb);
    }
}
