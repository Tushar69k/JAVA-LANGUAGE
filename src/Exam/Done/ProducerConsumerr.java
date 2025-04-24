package Exam.Done;

import java.util.*;

public class ProducerConsumerr {

    static class ProducerConsumer {
        LinkedList<Integer> list = new LinkedList<>();

        public void producer() throws InterruptedException {
            int value = 0;

            // Infinite Loop
            while (true) {
                synchronized (this) {
                    while (list.size() > 0) {
                        wait();
                    }

                    System.out.println("Produced : " + value);
                    list.add(value);
                    value++;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0) {
                        wait();
                    }

                    int value = list.removeFirst();
                    System.out.println("Consumed : " + value);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }


    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consumer();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}



