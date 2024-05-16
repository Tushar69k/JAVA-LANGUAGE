/*
QUESTION : Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
 */

package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P1_C2_CN {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if (a >= 'A' && a <= 'Z') {
            System.out.println("1");
        } else if (a >= 'a' && a <= 'z') {
            System.out.println("0");
        } else {
            System.out.println("THIS IS NOT A ALPHABET -1");
        }
    }


}
