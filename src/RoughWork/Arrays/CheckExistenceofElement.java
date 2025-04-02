package RoughWork.Arrays;

import java.util.Scanner;

public class CheckExistenceofElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element [" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element [" + i + "] : " + arr[i] + " ");
        }

        System.out.printf("Enter the Element you want to Check : ");
        int num = sc.nextInt();

        int flag = 0;
        int numm = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = 1;
                numm = i;
            }
        }

        if (flag == 1) {
            System.out.printf("Elemnt Exits at position " + numm + " !!!");
        } else if (flag == 0) {
            System.out.printf("Element Does'nt Exists");
        }

    }
}
