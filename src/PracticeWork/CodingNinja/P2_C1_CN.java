/*
QUESTION : Create a class named Person with a string variable 'name' and an integer variable 'age,' such that these
 variables are not accessible outside the class and implement a way to initialize the variables and print the variables.
*/
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P2_C1_CN {


    private int age;
    private String name;


    public P2_C1_CN setValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please ");
        name = sc.next();
        System.out.println("Enter your age please ");
        age = sc.nextInt();
        return this;
    }

    public void getValue() {
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }

    // Complete the class
}

class Solution {

    public static void main(String args[]) {
        P2_C1_CN tushar = new P2_C1_CN().setValue();
        tushar.getValue();
        // Write your code here
    }
}










