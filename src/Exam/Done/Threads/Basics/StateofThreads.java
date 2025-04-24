package Exam.Done.Threads.Basics;

public class StateofThreads extends Thread {

    @Override
    public void run() {
        System.out.println("Running");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

    }

    public static void main(String[] args) throws InterruptedException {

        StateofThreads t = new StateofThreads();

        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());

        Thread.sleep(200);
        System.out.println(t.getState());

        t.join();
        System.out.println(t.getState());


    }

}
