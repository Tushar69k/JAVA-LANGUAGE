package PracticeWork.Methods.Array;

import java.util.Scanner;

public class MultiDimensionalArray__1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows = ");
        int n = Sc.nextInt();
        System.out.print("Enter No. of Columns = ");
        int m = Sc.nextInt();
        int[][] flats = new int[n][m];

        System.out.println("printing a 2d array using for loop : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter Element " + (i + 1) + (" ") + (j + 1) + (" : "));
                flats[i][j] = Sc.nextInt();
                //Hello
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
//        System.out.println(" ");


    }
}