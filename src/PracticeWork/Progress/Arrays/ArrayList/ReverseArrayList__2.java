package PracticeWork.Progress.Arrays.ArrayList;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseArrayList__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        SetList(arr);
        GetList(arr);
        Reverse(arr);
    }


    public static ArrayList SetList(ArrayList arr) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter size of ArrayList : ");
        int size = tush.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element (" + i + ") : ");
            arr.add(tush.nextInt());
        }
        return arr;
    }


    public static void GetList(ArrayList arr) {
        System.out.println(arr);
    }

    public static void Reverse(ArrayList arr) {
        for (int i = 0; i < (arr.size()) / 2; i++) {
            Integer temp = (Integer) arr.get(i);
//       arr.set(temp , arr.get(i));
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, temp);
        }
        System.out.println(arr);
    }

}
