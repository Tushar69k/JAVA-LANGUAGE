// Explanation For SubArray

package PracticeWork.Progress.Arrays;

import java.util.*;

public class Explanation__SubArray_ {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println(" i is : " + i + " <=============== I =================> \n Here I is " + i);
            for (int J = i; J < 5; J++) {
                System.out.println(" J is : " + J + " <=== J ===> ");
                for (int k = 0; k <= J; k++) {
                    System.out.println(" k is : " + k);
                }
            }
        }


    }
}
