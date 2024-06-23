package PracticeWork.Progress.Arrays.Arrays_2D;

import java.util.*;

public class SpiralMatrix__4 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int[][] Matrix = SetMatrix();
        GetMatrix(Matrix);
        Spiral(Matrix);
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


    public static void Spiral(int[][] Matrix) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = Matrix.length - 1;
        int endColumn = Matrix[0].length - 1;
        System.out.print(" \n Spiral Matirx :: ");

        while (startRow <= endRow && startColumn <= endColumn) {

            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(Matrix[startColumn][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endColumn] + " ");
            }

            for (int j = endColumn - 1; j >= startColumn; j--) {
                System.out.print(Matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(Matrix[i][startColumn] + " ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }


    }


}
