package PracticeWork.Progress.Oops;

import java.util.*;

public class CallingClassInFunction__2 {

    public static class Cars { // Craeting Class
        String name;
        String type;
        int number;
    }

    public static void Function(Cars x) { // Giving datatype of class name(Cars)
        System.out.println("Car Name : " + x.name);
        System.out.println("Car Type : " + x.type);
        System.out.println("Car Number : " + x.number);
    }


    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        Cars c = new Cars();
        c.name = "Mercedes";
        c.type = "Luxury";
        c.number = 001;
        Function(c); // Calling by giving object name

    }

}
