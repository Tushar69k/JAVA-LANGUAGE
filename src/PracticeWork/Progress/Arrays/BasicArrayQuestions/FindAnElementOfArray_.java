/*
QUESTION : FIND THE POSITION OF ELEMENT FROM AN ARRAY .
 */
package PracticeWork.Progress.Arrays.BasicArrayQuestions;

import java.util.Scanner;

public class FindAnElementOfArray_ {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Your Array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the Elements in Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "] = ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array's Elements :: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + i + "] = " + numbers[i]);
        }
        System.out.print("Enter the Element whose Position you want to Find : ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("The Element " + x + " is at the Position : " + i);
            }
        }

    }
}






