package RoughWork.Internals.Threads;

class MyRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread");
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }

        System.out.println("Exiting Child Thread");
    }
}

public class RunThreads {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main Thread Exiting");

    }
}
