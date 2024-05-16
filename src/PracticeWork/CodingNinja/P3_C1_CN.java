/*
QUESTION : Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
*/
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P3_C1_CN {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PRINCIPAL AMOUNT : ");
        int pa = sc.nextInt();
        System.out.println("ENTER RATE OF INTEREST : ");
        float roi = sc.nextFloat();
        System.out.println("ENTER TIME PERIOD : ");
        int tp = sc.nextInt();
        int si = (int) (pa * roi * tp) / 100;
        System.out.println("YOUR SIMPLE INTEREST IS : ");
        System.out.println(si);

    }
}






