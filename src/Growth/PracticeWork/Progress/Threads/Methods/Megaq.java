package Growth.PracticeWork.Progress.Threads.Methods;

import java.util.Random;

public class Megaq {

    static final int ARRAY_SIZE = 100;
    static final int THREAD_COUNT = 4;
    static final int[] arr = new int[ARRAY_SIZE];
    static volatile boolean found = false;
    static int target = 0; // number to search

    public static void main(String[] args) {
        Random rand = new Random();
        target = rand.nextInt(100);  // Random target for demo

        // Fill the array with random numbers
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rand.nextInt(100); // values from 0 to 99
        }


        System.out.println("Searching for number: " + target);


        int SegmentSize = ARRAY_SIZE / THREAD_COUNT;

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * SegmentSize;
            int end = start + SegmentSize;
            new SearchThread(start, end, i).start();
        }
    }

    static class SearchThread extends Thread {
        int start, end, threadId;

        SearchThread(int start, int end, int threadId) {
            this.start = start;
            this.end = end;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            for (int i = start; i < end && !found; i++) {
                if (arr[i] == target) {
                    found = true;
                    System.out.println("Thread " + threadId + " found the number " + target + " at index " + i);
                    return;
                }
            }
            if (!found) {
                System.out.println("Thread " + threadId + " did not find the number " + target + ".");
            }

        }
    }
}
