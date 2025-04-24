/*Question.) Write a Java program for creating four threads to perform the following (6) operations:
i) Getting N numbers as input
ii) Printing the even numbers
iii) Printing the odd numbers
iv) Computing the average
 */

package Growth.PracticeWork.Progress.Threads;

import java.util.Scanner;

public class FourThreads {

    static int[] numbers; // Shared array
    static int n;         // Number of elements

    // Thread to take input
    static class InputThread extends Thread {
        public void run() {
            Scanner scanner = new Scanner(System.in);
            numbers = new int[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
        }
    }

    // Thread to print even numbers
    static class EvenThread extends Thread {
        public void run() {
            System.out.println("Even numbers:");
            for (int i = 0; i < n; i++) {
                if (numbers[i] % 2 == 0) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
        }
    }

    // Thread to print odd numbers
    static class OddThread extends Thread {
        public void run() {
            System.out.println("Odd numbers:");
            for (int i = 0; i < n; i++) {
                if (numbers[i] % 2 != 0) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
        }
    }

    // Thread to compute average
    static class AverageThread extends Thread {
        public void run() {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }
            double avg = (double) sum / n;
            System.out.println("Average: " + avg);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        n = scanner.nextInt();

        InputThread inputThread = new InputThread();
        inputThread.start();
        inputThread.join(); // Wait for input before processing

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        AverageThread averageThread = new AverageThread();

        evenThread.start();
        oddThread.start();
        averageThread.start();

        evenThread.join();
        oddThread.join();
        averageThread.join();
    }
}



