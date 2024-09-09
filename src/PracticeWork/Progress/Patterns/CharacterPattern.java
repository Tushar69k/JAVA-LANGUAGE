package PracticeWork.Progress.Patterns;

import java.util.*;


public class CharacterPattern {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = tush.nextInt();
        char ch = 'A';

        for (int i = 1; i <= size; i++) {
            for (int J = 1; J <= i; J++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
