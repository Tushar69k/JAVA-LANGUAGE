//Question : Calculate Cgpa of Students in 3 subjects ( OUT OF 100 )

package PracticeWork;

import java.util.Scanner;

public class CalculateCgpa__PQ_2 {
    public static void main(String[] args) {
        System.out.println("PROGRAM TO CALCULATE CGPA ");
        System.out.println("ENTER YOUR SUBJECTS OF GIVEN SUBJECTS --->");
        Scanner tush = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS IN JAVA : ");
        int a = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN C++ : ");
        int b = tush.nextInt();
        System.out.println("ENTER YOUR MARKS IN DSA OF BOTH (  TAKE MARKS OF DSA IN JAVA AND DSA IN C++ {OUT OF 50} AND WRITE THE GRAND TOTAL OF THEM ) : ");
        int c = tush.nextInt();
        int percentage = (a + b + c) / 2;
        float cgpa = percentage / 30f;
        System.out.println("SO THE CGPA OF THE STUDENT IS : " + cgpa);

    }

}




