package PracticeWork.Progress.SomeImpQuestions;
import java.util.*;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = tush.nextInt();
        int reverse;

        System.out.println("The reversed number is :  ");
        while (num > 0) {
            reverse = num % 10;
            num = num / 10;
            System.out.print(reverse);
        }


    }
}
