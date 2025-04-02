package PracticeWork.Progress.ExceptionHandling;

import java.util.*;

public class TryCatch {

    public static void main(String[] args) {

        int arr[] = new int[5];

        System.out.println("Hello Guys");

        System.out.println(arr[2]);

        try {
            System.out.println(arr[8]);
        } catch (Exception e) {
            System.out.println("Exception Handeled!");
        }

    }

}



