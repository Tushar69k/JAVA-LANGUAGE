package PracticeWork.Progress.Arrays.Arrays_2D;

import java.util.*;

public class Transpose__7 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int[][] Matrix = SetMatrix();
        GetMatrix(Matrix);
        Transpose(Matrix);
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
        System.out.println("\nMatrix of (" + Matrix.length + " X " + Matrix[0].length + ") :: ");
        for (int i = 0; i < Matrix.length; i++) {
            System.out.print(" |  ");
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print(Matrix[i][j] + "  ");
            }
            System.out.print("| ");
            System.out.println();
        }
    }

    public static void Transpose(int[][] Matrix) {
        int row = Matrix[0].length;
        int column = Matrix.length;
        int[][] Transpose = new int[row][column];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                Transpose[j][i] = Matrix[i][j];
            }
        }

        System.out.println("\nTranspose Of Matrix (" + row + " X " + column + ") :: ");
        for (int i = 0; i < Transpose.length; i++) {
            System.out.print(" |  ");
            for (int j = 0; j < Transpose[0].length; j++) {
                System.out.print(Transpose[i][j] + "  ");
            }
            System.out.println("| ");

        }

    }
}
