/* Question : Write program which asks User to enter His/Her name and greet them with " Hello <name>, Have a
good day. */

package PracticeWork;
import java.util.Scanner;

public class Greet__PQ_3 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME PLEASE : ");
        String name = tush.nextLine();
        System.out.println("HELLO " + name + " , HAVE A GREAT DAY");

    }
}
