package Growth.PracticeWork.Progress.Threads.Methods;

public class SetPriority {

    static class Tushar extends Thread {

        Tushar(String name) {
            super(name);
        }

        @Override
        public void run() {

            for (int i = 5; i > 0; i--) {

                System.out.println(Thread.currentThread().getName() + "'s Thread Classification = " + " Priority : " + Thread.currentThread().getPriority() + " Position : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }

        }

    }


    public static void main(String[] args) {

        Tushar t = new Tushar("Tushar");
        Tushar v = new Tushar("Vijay");
        Tushar a = new Tushar("Allu");

        v.setPriority(5);
        t.setPriority(10);
        a.setPriority(1);

        t.start();
        v.start();
        a.start();

    }


}
