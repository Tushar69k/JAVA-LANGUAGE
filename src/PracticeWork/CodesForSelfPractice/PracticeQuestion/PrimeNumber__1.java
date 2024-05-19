package PracticeWork.CodesForSelfPractice.PracticeQuestion;

import java.util.*;

public class PrimeNumber__1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number Check whether a Number is Prime or Not :  ");
        int num = sc.nextInt();
        int flag = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 69;
                break;
            }
        }

        if (flag == 69) {
            System.out.println("The Number is Not Prime ");
        } else {
            System.out.println("The Number is Prime ");
        }
    }
}
