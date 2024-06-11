package PracticeWork.CodesForSelfPractice.Class;

import java.util.*;


public class Employee__1 {
    static Scanner tush = new Scanner(System.in);

    static int Salary;
    static String name;

    public static void SetSalary() {
        System.out.print("Enter Your Salary : ");
        Salary = tush.nextInt();
    }

    public static void SetName() {
        System.out.print("Enter Your Full Name : ");
        name = tush.nextLine();
    }

    public static String GetName() {
        return name;
    }

    public static int GetSalary() {
        return Salary;
    }


    public static void main(String[] args) {
//        Scanner tush = new Scanner(System.in);
        Employee__1 e1 = new Employee__1();
        e1.SetName();
        e1.SetSalary();
        e1.GetName();
        e1.GetSalary();
        System.out.println(" Employee Details ::");
        System.out.println("\n Employee's Name is : " + name);
        System.out.println(name + "'s Salary is : " + Salary);

    }
}