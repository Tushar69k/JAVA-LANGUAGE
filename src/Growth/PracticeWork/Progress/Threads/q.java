package Growth.PracticeWork.Progress.Threads;

import java.util.Random;

public class q {

    static final int SIZE = 100;
    static final int THREAD_COUNT = 4;
    static final int[] array = new int[SIZE];
    static volatile boolean found = false;  // Shared flag

    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(200) + 1;  // Random target for demo

        // Fill the array with random numbers
        for (int i = 0; i < SIZE; i++) {
            array[i] = rand.nextInt(200) + 1;
        }

        System.out.println("Searching for number: " + target);

        Thread[] threads = new Thread[THREAD_COUNT];
        int segmentSize = SIZE / THREAD_COUNT;

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * segmentSize;
            int end = start + segmentSize;
            int threadId = i + 1;

            threads[i] = new Thread(new SearchTask(start, end, target, threadId));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        if (!found) {
            System.out.println("The number " + target + " was not found in the array.");
        }
    }

    static class SearchTask implements Runnable {
        private final int start;
        private final int end;
        private final int target;
        private final int threadId;

        SearchTask(int start, int end, int target, int threadId) {
            this.start = start;
            this.end = end;
            this.target = target;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            for (int i = start; i < end && !found; i++) {
                if (array[i] == target) {
                    found = true;
                    System.out.println("Thread-" + threadId + " found the number " + target + " at index " + i);
                    return;
                }
                try {
                    Thread.sleep(10); // Simulate processing time
                } catch (InterruptedException e) {
                    // Handle interruption
                }
            }

            if (!found) {
                System.out.println("Thread-" + threadId + " did not find the number in its segment.");
            }
        }
    }
}



