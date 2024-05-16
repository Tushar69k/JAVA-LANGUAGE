/*
QUESTION : FIND THE POSITION OF ELEMENT FROM AN ARRAY .
 */
package PracticeWork.CodesForSelfPractice.ARRAYS;

import java.util.Scanner;

public class FindAnElementOfArray__2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF YOUR ARRAY : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("ENTER THE ELEMETS IN YOUR ARRAY : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "] = ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("YOUR ELEMENTS ARE ------->");
        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + i + "] = " + numbers[i]);
        }
        System.out.println("ENTER THE ELEMENT WHOSE POSITION YOU WANT TO FIND :");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("THE ELEMENT " + x + " IS AT THE POSITION : " + i);
            }
        }

    }
}






