package Exam.Done.Interface;

public class MiUsingMi {
    // Interface 1
    interface Printable {
        void print();
    }

    // Interface 2
    interface Showable {
        void show();
    }

    // Class implementing both interfaces
    static class Document implements Printable, Showable {
        public void print() {
            System.out.println("Printing the document...");
        }

        public void show() {
            System.out.println("Showing the document...");
        }
    }

    // Main class to run the example
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();  // from Printable interface
        doc.show();   // from Showable interface
    }
}




