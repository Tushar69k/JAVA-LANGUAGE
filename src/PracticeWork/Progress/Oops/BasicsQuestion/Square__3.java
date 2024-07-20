package PracticeWork.Progress.Oops.BasicsQuestion;

import java.util.*;

public class Square__3 {
    static Scanner tush = new Scanner(System.in);
    static int side;

    static void Side() {
        System.out.print("Enter Side Of Square : ");
        side = tush.nextInt();
    }

    static int Area() {
        return (side * side);
    }

    static int Perimeter() {
        return (4 * side);
    }

    public static void main(String[] args) {
        Square__3 s1 = new Square__3();
        Square__3 s2 = new Square__3();

        System.out.print("Enter No. of Squares : ");
        int num = tush.nextInt();
        System.out.println();

        for (int i = 1; i <= num; i++) {
            Square__3 s = new Square__3();
            System.out.println("Enter Detail of Square : " + i);
            s.Side();
            System.out.println("Area Of Square : " + (s.Area()));
            System.out.print("Perimeter Of Square : " + (s.Perimeter()) + "\n");
            System.out.println();

        }


    }
}
