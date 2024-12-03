package PracticeWork.Progress.Patterns;

import java.util.*;

public class HollowRectangle_ {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter no. of Rows : ");
        int rows = tush.nextInt();
        System.out.print("Enter no. of Columns : ");
        int columns = tush.nextInt();
        System.out.println("Your Hollow Rectangle of " + rows + " Rows & " + columns + " Columns are :: ");
        Pattern(rows, columns);


    }

    public static void Pattern(int rows, int columns) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}
