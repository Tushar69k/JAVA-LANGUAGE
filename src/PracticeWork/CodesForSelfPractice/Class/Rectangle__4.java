package PracticeWork.CodesForSelfPractice.Class;

import java.util.*;

public class Rectangle__4 {
    static Scanner tush = new Scanner(System.in);
    static int length;
    static int width;

    static void Sides() {
        System.out.print("Enter Length : ");
        length = tush.nextInt();
        System.out.print("Enter Width : ");
        width = tush.nextInt();
    }

    static int Area() {
        return (length * width);
    }

    static int Perimeter() {
        return ((length + width) * 2);
    }

    public static void main(String[] args) {

        System.out.print("Enter No. of Rectangles : ");
        int num = tush.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("\n Enter Details of Rectangle : " + i);
            Rectangle__4 r = new Rectangle__4();
            r.Sides();
            System.out.println("Area of Recatngle : " + r.Area());
            System.out.println("Perimeter of Recatngle : " + r.Perimeter());

        }

    }
}
