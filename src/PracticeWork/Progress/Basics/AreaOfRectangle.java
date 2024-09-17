/*
QUESTION : Take the length(L) and breadth(B) of the rectangle as input and find its area.
 */
package PracticeWork.Progress.Basics;

import java.util.Scanner;

public class AreaOfRectangle {


    public static void main(String args[]) {
        System.out.println("Program to calculate area of Rectangle :: ");
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle : ");
        length = sc.nextInt();
        System.out.print("Enter breadth of Rectangle : ");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.print("Area of Rectangle is : ");
        System.out.print(area);
        // Write code here

    }
}



