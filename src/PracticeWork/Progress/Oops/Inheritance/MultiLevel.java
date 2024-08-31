package PracticeWork.Progress.Oops.Inheritance;

import java.util.*;

public class MultiLevel {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        Moniter s1 = new Moniter();
        s1.classname();
        s1.StudentCount();
        s1.MoniterName();
    }

    static class Class {
        void classname() {
            System.out.println("This is Nursery Class.");
        }
    }


    static class Student extends Class {
        void StudentCount() {
            System.out.println("There are 30 Students in this Class.");
        }
    }


    static class Moniter extends Student {
        void MoniterName() {
            System.out.println("Tushar is Monitor of Nursery Class.");
        }
    }

}
