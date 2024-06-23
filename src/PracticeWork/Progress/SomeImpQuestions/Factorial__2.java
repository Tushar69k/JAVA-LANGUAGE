package PracticeWork.Progress.SomeImpQuestions;

import java.util.*;

public class Factorial__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println(" Enter a Number to find Factorial :  ");
        int num = tush.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        //        for (int i = num ; i >= 1 ; i--){
//            fact = fact * i;
//        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
/*
    Factorial Number Program in Java
    num! = num * (num-1) * (num-2) * ... 2 * 1
*/


