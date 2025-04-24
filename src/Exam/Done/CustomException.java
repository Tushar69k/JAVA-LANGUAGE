package Exam.Done;

import java.util.*;

public class CustomException {

    static class customException extends Exception {
        customException(String e) {
            super(e);
        }
    }

    public static void main(String[] args) throws customException {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        try {
            checker(age);
        } catch (customException e) {
            System.out.println("nannananana");
            e.printStackTrace();
        }
    }

    static public void checker(int a) throws customException {
        if (a < 18) {
            throw new customException("You are UnderAge!!!!");
        } else {
            System.out.println("Love Everyone!!!");
        }
    }
}



