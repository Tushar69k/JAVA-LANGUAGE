package Growth.PracticeWork.Progress.Threads.Methods;

public class setDaemon {


    static class Raju extends Thread {


        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("Jai Ram Ji ki");
            }
        }
    }

    static class Tushar extends Thread {

        @Override
        public void run() {
            for (; ; ) {
                System.out.println("Hello World");
            }
        }
    }

    public static void main(String[] args) {

        Tushar t = new Tushar();
        Raju r = new Raju();

        t.setDaemon(true);
        t.start();

        r.start();

        System.out.println("Main Thread Ended");

    }


}

// Daemon thread jab sare threads ka kaam ho jaye usk thodi der bad band ho jata hai .

// Agar Daemon thread Akela ho or kisi Dusre Thread ko kaam na ho to Daemon thread apna kaam pura kiye bina band Ho Jayega