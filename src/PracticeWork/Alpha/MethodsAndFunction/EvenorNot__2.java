package PracticeWork.Alpha.MethodsAndFunction;

import java.util.*;
import java.util.Scanner;


public class EvenorNot__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int num = tush.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even ");
        } else {
            System.out.println(" Number is odd ");
        }
        isEven(num);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
