package PracticeWork.Progress.Oops.Polymorphism.CompileTimePolymorphism;

import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println(sum(60, 9));
        System.out.println(sum(60, 5, 4));
        System.out.println(sum(60F, 9F));
        System.out.println(sum(60, 8F, 1));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    static double sum(double a, float b, int c) {
        return a + b + c;
    }


}
