/*
QUESTION : Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
 */

package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class AlphabetOrNot__9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nProgram to check whether given input is Alphabet or Not :: ");
        System.out.print(" Give Input : ");
        char a = sc.next().charAt(0);

        if (a >= 'A' && a <= 'Z') {
            System.out.println(a + " is Capital Alphabet");
        } else if (a >= 'a' && a <= 'z') {
            System.out.println(a + " is Small Alphabet ");
        } else {
            System.out.println(a + " is not a Alphabet");
        }
    }


}
