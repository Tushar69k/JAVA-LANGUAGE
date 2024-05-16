/*
QUESTION : Take the length(L) and breadth(B) of the rectangle as input and find its area.
 */
package PracticeWork.CodingNinja;

import java.util.Scanner;

public class P1_C1_CN {


    public static void main(String args[]) {
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE : ");
        length = sc.nextInt();
        System.out.println("ENTER THE BREADTH OF THE RECTANGLE : ");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.print("THE AREA OF RECTANGLE IS ");
        System.out.println(area);
        // Write code here

    }
}



