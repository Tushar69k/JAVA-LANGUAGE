package PracticeWork.Progress.Afterwards;

import java.util.*;

public class EvenorNNottttt {

    static Scanner sc = new Scanner(System.in);
    static int num;

    public static void GetNum() {
        System.out.print("Enter Number to be Checked : ");
        num = sc.nextInt();
    }

    public static void Even() {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

    }

    public static void main(String[] args) {
        GetNum();
        Even();
    }

}
