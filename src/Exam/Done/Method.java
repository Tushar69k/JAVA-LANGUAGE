/*Create a class called Employee that includes these instance variables
	- EmpNo
	- MonthlySal
	- Employee() {Constructor}
	- yearlySalary() {Display each employees annual salary}
	- raisedSalary() {Give each employee 10% raise and display each Employee's increased salary} using method

    Objects of Employee Class - 2*/
package Exam.Done;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.displayInfo();
        E1.yearlySalary();
        E1.raisedSal(20);

        Employee E2 = new Employee(3142, 12000);
        E2.displayInfo();
        E2.yearlySalary();
        E2.raisedSal(10);
    }


    static class Employee {
        private final int EmpNo;
        private double MonthlySal;

        Scanner Sc = new Scanner(System.in);

        Employee(int empNo, double monthlySalary) { // Parameterized Constructor
            EmpNo = empNo;
            MonthlySal = monthlySalary;
        }

        Employee() { //  Default Constructor
            System.out.print("Enter Employee No : ");
            EmpNo = Sc.nextInt();

            System.out.print("Enter Monthly Salary of (Emp" + EmpNo + ") : ");
            MonthlySal = Sc.nextInt();
        }

        void yearlySalary() {
            System.out.println("Yearly Salary of (Emp" + EmpNo + ") = " + (MonthlySal * 12));
        }

        void displayInfo() {
            System.out.println("\nEmployee No. : " + EmpNo);
            System.out.println("Monthly Salary : " + MonthlySal);
        }

        void raisedSal(double percent) {
            percent /= 100;
            MonthlySal += (MonthlySal * percent);
            displayInfo();

        }
    }
}
