package PracticeWork.Progress.Arrays.Arrays_2D;

import java.util.*;

public class SearchInSortedMatrix__6 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
//        int[][] Matrix = SetMatrix();
        int[][] Matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
//        GetMatrix(Matrix);
        SortedSearch(Matrix);
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

    public static boolean SortedSearch(int[][] Matrix) {
        System.out.print("\n Enter Key to find : ");
        Scanner tush = new Scanner(System.in);
        int key = tush.nextInt();

        int row = 0;
        int col = Matrix[0].length - 1;

        while (row < Matrix.length && col >= 0) {
            if (Matrix[row][col] == key) {
                System.out.println(" Key found at (" + row + " , " + col + ")");
                return true;
            } else if (key < Matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(" Key not found");
        return false;


    }


}
