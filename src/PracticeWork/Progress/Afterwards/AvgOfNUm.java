package PracticeWork.Progress.Afterwards;

import java.util.*;

public class AvgOfNUm {

    static Scanner sc = new Scanner(System.in);
    static int Num1, NUm2, NUm3;

    public static void GetNum() {
        System.out.println("Enter 1st number : ");
        Num1 = sc.nextInt();
        NUm2 = sc.nextInt();
        NUm3 = sc.nextInt();
    }

    public static int Avg() {
        return (NUm3 + NUm2 + Num1) / 3;
    }

    public static void main(String[] args) {
        GetNum();
        System.out.println("Avg : " + Avg());
    }


}
