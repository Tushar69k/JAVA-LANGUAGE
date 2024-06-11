//Question : Write a Function to Calculate sum of first n Natural numbers
package PracticeWork.CodesForSelfPractice.Methods;

import java.util.*;

public class SumOfNaturalNumbers__3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = tush.nextInt();
        int Finale = sum(number);
        System.out.println(Finale);
    }

    static public int sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result = result + i;
        }
        return result;
    }


}
