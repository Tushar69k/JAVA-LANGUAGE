package PracticeWork.Progress.Oops;

import java.util.*;

public class CopyConstructor {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Tushar";
        s1.roll_no = 69;
        s1.password = "HoHoHoHo";
        System.out.println("Student s1 ::");
        System.out.println("Name = " + s1.name);
        System.out.println("Roll No. = " + s1.roll_no);
        System.out.println("Password = " + s1.password);


//        Copying information of s1 for s2 using Copy Constructor
        Student s2 = new Student(s1); // Copy Constructor Called
        System.out.println("\nStudent s2 :: ( Copied From s1 )");
        System.out.println("Name = " + s2.name);
        System.out.println("Roll No. = " + s2.roll_no);
        System.out.println("Password = " + s2.password);


        Student s3 = new Student();
        s3.name = "Thala";
        s3.roll_no = 07;
        s3.password = "Bole Jo Koyal";
        System.out.println("\nStudent s3 ::");
        System.out.println("Name = " + s3.name);
        System.out.println("Roll No. = " + s3.roll_no);
        System.out.println("Password = " + s3.password);

//        Copying information of s3 for s4 using Copy Constructor
        Student s4 = new Student(s3); // Copy Constructor Called
        System.out.println("\nStudent s4 :: ( Copied From s3 )");
        System.out.println("Name = " + s4.name);
        System.out.println("Roll No. = " + s4.roll_no);
        System.out.println("Password = " + s4.password);
    }
}


class Student {
    String name;
    int roll_no;
    String password;

    Student() {
//            System.out.println("Constructor Invoked !");
    }

    Student(Student temp) { // Copy Constructor Created
        this.name = temp.name;
        this.roll_no = temp.roll_no;
        this.password = temp.password;
    }
}
