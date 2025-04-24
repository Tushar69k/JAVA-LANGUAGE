package ExamThreadQuestion;

import java.util.Random;

public class q2 {


    static final int ARRAY_SIZE = 100;
    static final int THREAD_COUNT = 4;
    static int[] arr = new int[ARRAY_SIZE];
    static volatile boolean found = false; // shared flag to stop threads
    static int target = 0; // number to search

    public static void main(String[] args) {
        // Fill array with random numbers
        Random rand = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rand.nextInt(100); // values from 0 to 99
        }

        // Choose a random number from array to search for
        target = arr[rand.nextInt(ARRAY_SIZE)];
        System.out.println("Searching for number: " + target);

        int chunkSize = ARRAY_SIZE / THREAD_COUNT;

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * chunkSize;
            int end = (i == THREAD_COUNT - 1) ? ARRAY_SIZE : start + chunkSize;
            new SearchThread(start, end, i).start();
        }
    }

    static class SearchThread extends Thread {
        int start, end, threadId;

        public SearchThread(int start, int end, int threadId) {
            this.start = start;
            this.end = end;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            for (int i = start; i < end && !found; i++) {
                if (arr[i] == target) {
                    found = true;
                    System.out.println("Thread " + threadId + " found the number at index " + i);
                    return;
                }

                try {
                    Thread.sleep(1); // simulate some delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (!found) {
                System.out.println("Thread " + threadId + " did not find the number.");
            }
        }
    }
}


