package PracticeWork.Progress.Loops;

import java.util.*;

public class SumOfFirstnNaturalNumbers {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print(" Enter Natural numbers upto you want sum : ");
        int size = tush.nextInt();
        int sum = 0;
        SumFor(size, sum);
        SumWhile(size, sum);
        SumDo(size, sum);
    }

    public static void SumFor(int size, int sum) {
        System.out.println("\n Using For loop :: ");
        for (int i = 1; i <= size; i++) {
            sum = sum + i;
        }

        System.out.println(" Sum upto " + size + " Natural numbers is : " + sum);
    }

    public static void SumWhile(int size, int sum) {
        System.out.println("\n Using While loop :: ");
        int i = 1;
        while (i <= size) {
            sum = sum + i;
            i++;
        }

        System.out.println(" Sum upto " + size + " Natural numbers is : " + sum);
    }

    public static void SumDo(int size, int sum) {
        System.out.println("\n Using Do loop :: ");
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= size);

        System.out.println(" Sum upto " + size + " Natural numbers is : " + sum);
    }


}
