package PracticeWork.Progress.Oops.HUHUHUHUHUHU;

import java.util.Scanner;

public class CreatingClass__1 {

    public static class Student { // Class is created
        String name;
        int roll_no;
        double percentage;
    }

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Student tushar = new Student(); // Object is created of Class Student
        tushar.name = "Tushar";
        tushar.roll_no = 7;
        tushar.percentage = 99;

        System.out.println(tushar.name);
        System.out.println(tushar.roll_no);
        System.out.println(tushar.percentage);
    }
}
