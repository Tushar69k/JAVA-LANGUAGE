package PracticeWork.Progress.Oops;

import java.util.*;

public class UpdationByClass__3 {
    public static class Student { // Class is created
        String name;
        int roll_no;
        double percentage;
    }


    public static void Function(Student x) {
        x.name = "Changed Tushar";
        x.roll_no = 77;
        x.percentage = 100;
    }

    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Student tushar = new Student(); // Object is created of Class Student
        tushar.name = "Tushar";
        tushar.roll_no = 7;
        tushar.percentage = 99;


        System.out.println("Name : " + tushar.name);
        System.out.println("Roll Number : " + tushar.roll_no);
        System.out.println("% : " + tushar.percentage);


        Function(tushar);
        System.out.println("\nUpdating Class members value by Function :: ");
        System.out.println("This work by Call By Refrence");
        System.out.println("Changed Name : " + tushar.name);
        System.out.println("Changed Roll Number : " + tushar.roll_no);
        System.out.println("Changed % : " + tushar.percentage);


    }
}
