package PracticeWork.Progress.Strings;

import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        Reverese(str);
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


    public static void Reverese(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else { // ch == ''
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0, sb.length()); // or sb = new StringBuilder(" ");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println("\n" + ans);
    }
}
