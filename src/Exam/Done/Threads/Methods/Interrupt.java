package Exam.Done.Threads.Methods;

public class Interrupt {

    static class Tushar extends Thread {

        Tushar(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is Running");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {

        Tushar t = new Tushar("Tushar");

        t.start();
        t.interrupt();

    }

}
