package RoughWork.Internals.Threads;

class NewThread extends Thread {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }

        System.out.println("Exiting Child Thread");
    }
}


public class MultiThreading {
    public static void main(String[] args) {

        NewThread nt = new NewThread();
        nt.start();

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
