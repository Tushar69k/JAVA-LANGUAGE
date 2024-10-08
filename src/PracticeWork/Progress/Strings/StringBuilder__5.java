package PracticeWork.Progress.Strings;

import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        StringBuilder(str);
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


    public static void StringBuilder(String str) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("\nString Builder ::");
        System.out.println(sb);
    }
}
