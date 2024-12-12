package PracticeWork.Progress.Afterwards;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Setarr();
        Getarr(arr);
    }


    public static int[] Setarr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements of your Array :: ");

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void Getarr(int[] arr) {

        System.out.println("Your Array is :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            System.out.print(arr[i]);
        }
        System.out.print("|");
    }


}