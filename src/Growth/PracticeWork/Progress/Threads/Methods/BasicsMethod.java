package Growth.PracticeWork.Progress.Threads.Methods;

public class BasicsMethod {

    public static void main(String[] args) throws InterruptedException {

        Tushar t = new Tushar("FirstThread");
        t.start();

        for (int i = 0; i < 10; i++) {

            Thread.sleep(1000);

            System.out.println("Main Thread");
        }

        System.out.println(":: Join() Called ::");
        t.join();


        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }

    static class Tushar extends Thread {
        Tushar(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Created Thread");
            }

        }

    }


}

// Start , Run , Sleep , Join