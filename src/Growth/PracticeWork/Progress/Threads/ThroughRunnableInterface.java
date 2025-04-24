package Growth.PracticeWork.Progress.Threads;

public class ThroughRunnableInterface {

    public static class Example implements Runnable {

        @Override
        public void run() {
            System.out.println("The name of Current Running Thread is : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Example ex = new Example();
        Thread t = new Thread(ex);
        t.start();

        System.out.println("The name of Current Running Thread is : " + Thread.currentThread().getName());
    }
}


