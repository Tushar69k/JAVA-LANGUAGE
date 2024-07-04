package PracticeWork.Progress.Arrays.CodeChef;

import java.util.*;

public class NumberOfCodesInWeek__1 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner Sc = new Scanner(System.in);
        int[] arr = new int[4];
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number of Codes ");
            arr[i] = Sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 10) {
                flag++;
            }

        }

        System.out.println(flag);


    }
}


