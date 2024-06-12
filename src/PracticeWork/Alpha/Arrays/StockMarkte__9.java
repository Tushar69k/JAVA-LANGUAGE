package PracticeWork.Alpha.Arrays;

import java.util.*;

public class StockMarkte__9 {
    public static void main(String[] args) {


        int[] arr = Setarr();
        GetArr(arr);
        Stocks(arr);
    }

    public static int[] Setarr() {
        Scanner tush = new Scanner(System.in);
//        System.out.print("Enter No. of Days : ");
//        int size = tush.nextInt();
        int size = 10;

        int[] arr = new int[size];
        return arr;
    }


    public static void GetArr(int[] arr) {
        Random ramdom = new Random();
        System.out.println("\n<====== Stock Market Of last 10 Days ======>\n");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramdom.nextInt(1, 100);
            System.out.println(" Day " + (i + 1) + " : " + arr[i]);
        }
        System.out.println();
    }


    static void Stocks(int[] arr) {

        int Buy = arr[0];
        int Day = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Buy > arr[i]) {
                Buy = arr[i];
                Day = i;
            }
        }

        System.out.print(" Best Buying price of Stock is" + " ( Day " + (Day + 1) + " ) : " + Buy + " rs \n");

        int Sell = arr[0];
        Day = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Sell < arr[i]) {
                Sell = arr[i];
                Day = i;
            }
        }
        System.out.print(" Best Selling price of Stock is" + " ( Day " + (Day + 1) + " ) : " + Sell + " rs \n");

    }


}





