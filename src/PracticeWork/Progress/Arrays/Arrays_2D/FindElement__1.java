package PracticeWork.Progress.Arrays.Arrays_2D;

import java.util.*;

public class FindElement__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int[][] Matrix = SetMatrix();
        GetMatrix(Matrix);
        Find(Matrix);
    }

    public static int[][] SetMatrix() {
        Scanner tush = new Scanner(System.in);

        System.out.print(" Enter No. of Rows : ");
        int rows = tush.nextInt();
        System.out.print(" Enter No. of Columns : ");
        int columns = tush.nextInt();

        int[][] Matrix = new int[rows][columns];

        System.out.println("\nEnter Elements for Matrix (" + rows + " X " + columns + ") ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element ( " + (i + 1) + " , " + (j + 1) + " ) : ");
                Matrix[i][j] = tush.nextInt();
            }
        }
        return Matrix;
    }

    public static void GetMatrix(int[][] Matrix) {
        System.out.println("\nElements in Matrix Are :: ");
        for (int i = 0; i < Matrix.length; i++) {
            System.out.print(" |  ");
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print(Matrix[i][j] + "  ");
            }
            System.out.print("| ");
            System.out.println();
        }
    }

    public static void Find(int[][] Matrix) {

        int flag = 0;
        System.out.print("Enter Element you want to find : ");
        Scanner tush = new Scanner(System.in);
        int element = tush.nextInt();

        int row = 0, column = 0;

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (element == Matrix[i][j]) {
                    System.out.print("Element exists at Cell (" + (i + 1) + " , " + (j + 1) + ") \n");
                }
            }
        }
    }
}
