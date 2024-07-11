package PracticeWork.Progress.BitManipulation;

import java.util.*;

public class BitwiseOperators__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int a = 5;
        int b = 6;
        System.out.println("Bitwise Operators ::");


// And (&) Operator
        System.out.print("\nAnd (&) Operator :\nUsing And (&) Operator for " + a + " , " + b + " : \n");
        System.out.print("5 & 6 : ");
        System.out.println(a & b);
/*
            AND Operator ::
            if any one bit is 0 then resulting bit will also be 0
            OR
            if both the bits are 1 only then resulting bit will be 1.

            Using And (&) Operator for 5 and 6 :

            EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 1 0 0 --> 4
 */


// Or (|) Operator
        System.out.print("\nOr (|) Operator :\n");
        System.out.print("Using Or (|) Operator for " + a + " , " + b + " : \n");
        System.out.print("5 | 6 : ");
        System.out.println(a | b);
        /*
            OR Operator ::
            if any one bit is 1 then resulting bit will also be 1.
            OR
            if both the bits are 0 only then resulting bit will be 0.

             Using Or (|) Operator for 5 and 6 :

            EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 1 1 1 --> 7
*/

        System.out.println("\nXOR (^) Operator : ");
        System.out.print("Using XOR (^) Operator for " + a + " , " + b + " : \n");
        System.out.print("5 ^ 6 : ");
        System.out.println(5 ^ 6);
        /*
        XOR Operator
        if any both bits are Different then resulting bit will be 1.
        OR
        if both the bits are Same only then resulting bit will be 0.

        EX :-
            5 - 0 1 0 1
            6 - 0 1 1 0
       Result - 0 0 1 1 --> 3
                */

        System.out.println("\nBinary Compliment (~) :");

        System.out.print("Using Binary Compliment (~) for " + a + " : \n");
        System.out.print("~" + a + " : ");
        System.out.print(~a);

    }
}
