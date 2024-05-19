/*
QUESTION : Input ----> s = "abcd"
Output ----> a ab abc abcd b bc bcd c cd d
 */

/*
substring(i,j) --> gives substring from index i to (j-1)
substring(i); --> gives substring from index i to end of string
 */

package PracticeWork.Methods.Strings;

import java.util.*;

public class SubString__2 {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.print(" " + s.substring(0, 1));
        System.out.print(" " + s.substring(0, 2));
        System.out.print(" " + s.substring(0, 3));
        System.out.print(" " + s.substring(0, 4));
        System.out.print(" " + s.substring(1, 2));
        System.out.print(" " + s.substring(1, 3));
        System.out.print(" " + s.substring(1, 4));
        System.out.print(" " + s.substring(2, 3));
        System.out.print(" " + s.substring(2, 4));
        System.out.print(" " + s.substring(3));

        System.out.println("\n");

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length() + 1; j++) {
                System.out.print(" " + s.substring(i, j));
            }
        }
    }
}
