/*
        We can Perform Multiple Inheritance using interfaces.
        We must require at-least 2 interfaces to perform Multiple Inheritance and  will implement both
        of them using below given syntax :

        class <ClassName> implements <Interface_1> , <Interface_2> , etc. {

        }
*/
package PracticeWork.Progress.Oops.Interface;

import java.util.*;

public class MultilpleInheritancUsingInterfaces {

    static Scanner tush = new Scanner(System.in);

    interface Addition { // To Add Two Numbers
        int add(int a, int b);
    }

    interface Subtract { // To Subtract Two Numbers
        int sub(int a, int b);
    }

    interface Divide { // To Divide Two Numbers

        double div(int a, int b);
    }

    interface Multiply { // To Multiply Two Numbers
        int mult(int a, int b);
    }

    interface Modulo { // To Find Modulo Two Numbers
        double mod(int a, int b);
    }

    static class Calculator implements Addition, Subtract, Divide, Multiply, Modulo {

        @Override
        public int add(int a, int b) {
            return (a + b);
        }

        @Override
        public double div(int a, int b) {
            return (a / b);
        }

        @Override
        public int mult(int a, int b) {
            return (a * b);
        }

        @Override
        public int sub(int a, int b) {
            return (a - b);
        }

        @Override
        public double mod(int a, int b) {
            return (a % b);
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println("Program to Perform Calculations on Two Numbers : ");

        System.out.print("Enter 1st Number : ");
        int a = tush.nextInt();

        System.out.print("Enter 2nd Number : ");
        int b = tush.nextInt();

        System.out.println();

        System.out.print("Addition : " + a + " + " + b + " = ");
        System.out.println(c1.add(a, b) + "\n");

        System.out.print("Subtraction : " + a + " - " + b + " = ");
        System.out.println(c1.sub(a, b) + "\n");

        System.out.print("Multiplication : " + a + " * " + b + " = ");
        System.out.println(c1.mult(a, b) + "\n");

        System.out.print("Division : " + a + " / " + b + " = ");
        System.out.println(c1.div(a, b) + "\n");

        System.out.print("Modulo : " + a + " % " + b + " = ");
        System.out.println(c1.mod(a, b) + "\n");

    }

}



