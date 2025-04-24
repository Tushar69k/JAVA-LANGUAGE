package Exam.Done.Threads.Basics;

public class ThroughThreadClass {

    public static class Example extends Thread {

        @Override
        public void run() {
            System.out.println("The name of Current Running Thread is : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Example ex = new Example();
        ex.start();

        System.out.println("The name of Current Running Thread is : " + Thread.currentThread().getName());
    }
}
