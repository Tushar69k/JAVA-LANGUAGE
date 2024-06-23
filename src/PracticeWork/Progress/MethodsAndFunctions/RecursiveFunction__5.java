//Question : Write a Recursive Fumction to Calculate sum of first n Natural numbers

package PracticeWork.Progress.MethodsAndFunctions;

import java.util.*;

public class RecursiveFunction__5 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = tush.nextInt();
        int result = natural(num);
        System.out.println("The sum of natural numbers from " + num + " is : " + result);

    }

    static int natural(int num) {
        if (num == 1) {
            return 1;
        }

        int res = num + natural(num - 1);
        return res;
    }


}
