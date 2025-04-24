/*Question.) Write a Java program for creating four threads to perform the following (6) operations:
i) Getting N numbers as input
ii) Printing the even numbers
iii) Printing the odd numbers
iv) Computing the average*/
package Exam.Done;

import java.util.*;

public class FourThreads {

    static int[] arr;
    static int num;

    static class Numbers extends Thread {


        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            arr = new int[num];

            System.out.println("Enter that " + num + " Numbers :");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
    }

    static class Even extends Thread {
        @Override
        public void run() {
            System.out.println("Even Numbers :");
            for (int i = 0; i < num; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + "  ");
                }
            }
            System.out.println();
        }
    }


    static class Odd extends Thread {
        @Override
        public void run() {
            System.out.println("Odd Numbers :");
            for (int i = 0; i < num; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    static class Average extends Thread {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = arr[i] + sum;
            }

            int Avg = sum / num;

            System.out.println("Average of Numbes : " + Avg);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Numbers : ");
        num = sc.nextInt();

        Numbers n = new Numbers();
        n.start();
        n.join();

        Even e = new Even();
        e.start();
        e.join();
        Odd o = new Odd();
        o.start();
        o.join();
        Average a = new Average();
        a.start();
        a.join();

    }


}
