package PracticeWork.Progress.Strings;

import java.util.*;

public class PalindromeSubSubtring {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        String str = SetString();
        GetString(str);
        SubString(str);
    }

    public static String SetString() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = tush.nextLine();
        return str;
    }

    public static void GetString(String str) {
        System.out.print("Entered String : " + str + "\n");
    }

    public static void SubString(String str) {

        System.out.print("\nSubstring : ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }


        int count = 0;
        System.out.print("\nPalindrome SubString : ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                if (IsPAlindrome(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }

        System.out.println("\nThe number of Palindromic Substring : " + count);
    }

    public static boolean IsPAlindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
