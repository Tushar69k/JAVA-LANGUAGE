package PracticeWork.Progress.ExceptionHandling;

import java.util.*;

public class Finally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number to be divided by Zero : ");
        int nu = sc.nextInt();

        try {
            System.out.println("Your Answer : " + nu / 0);
        } catch (Exception e) {
            System.out.println("Handeled");
        } finally {
            System.out.println("::Finally will Run Anyways Exception Occurs or Not ::");
        }


    }


}
