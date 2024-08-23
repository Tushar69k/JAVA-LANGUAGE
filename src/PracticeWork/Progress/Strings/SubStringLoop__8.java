/*Question :: Input : s = "abcd"
Output : a ab abc abcd b bc bcd c cd d*/
package PracticeWork.Progress.Strings;

import java.util.*;

public class SubStringLoop__8 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        SubString(str);
    }

    public static String SetString() {
        Scanner tush = new Scanner(System.in);
        System.out.println("Enter String in form of alphabets (like abcdef) ::");
        System.out.print("Enter String : ");
        String str = tush.nextLine();
        return str;
    }

    public static void GetString(String str) {
        System.out.print("Entered String is : " + str);
    }


    public static void SubString(String str) {
        System.out.println("\nSubstring :: ");

        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
