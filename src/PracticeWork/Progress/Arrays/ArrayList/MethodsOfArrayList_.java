package PracticeWork.Progress.Arrays.ArrayList;

import java.util.*;

public class MethodsOfArrayList_ {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

// To add elements in ArrayList add() is used. index was set according [0] - [length of array]
        System.out.println("To add element in ArrayList add() is used :: ");
        System.out.println("Adding 22 at index (0) : arr.add(22);");
        arr.add(22); // Element added to arr[0]
        System.out.println("Adding 44 at index (1) : arr.add(44);");
        arr.add(44); // Element added to arr[1]
        System.out.println("Adding 66 at index (2) : arr.add(66);");
        arr.add(66); // Element added to arr[2]
        System.out.println("Adding 77 at index (3) : arr.add(77);");
        arr.add(77); // Element added to arr[3]
        System.out.println("Adding 88 at index (4) : arr.add(88);");
        arr.add(88); // Element added to arr[4]


        // To get the element to index get() is used.
        System.out.println("\nUsing get() Method to get element by Index :: ");
        System.out.println("Getting element by using get(0) Method : " + arr.get(0));
        System.out.println("Getting element by using get(1) Method : " + arr.get(1));
        System.out.println("Getting element by using get(2) Method : " + arr.get(2));
        System.out.println("Getting element by using get(3) Method : " + arr.get(3));
        System.out.println("Getting element by using get(4) Method : " + arr.get(4));


        // To get First and Last Element of ArrayList
        System.out.println("\nGetting First and Last elemnet of ArrayList :: ");
        System.out.println("Using getFirst() :");
        System.out.println("First element of ArrayList : " + arr.getFirst());
        System.out.println("Using getLast :");
        System.out.println("Last element of ArrayList : " + arr.getLast());


// To check Length of ArrayList size()
        System.out.println("\nTo check Length of ArrayList size() is used :: ");
        System.out.println("Length of ArrayList : " + arr.size());


// To get all the Elements of ArrayList simply write the name of Object of ArrayList (arr)
        System.out.println("\nGetting all Elements of ArrayList using name of Object of ArrayList :: ");
        System.out.println(arr);


// To add elements in ArrayList add() is used
        System.out.println("\nUsing add() :: ");
        System.out.println("To Add an element at specific index, We use add(index,element) method : ");
        System.out.println("Here, Adding 11 at (0) index, arr.add( index:0 , element:11) :");
        arr.add(0, 11);
        System.out.println(arr);

//  To Modifying element in ArrayList set() is used
        System.out.println("\nUsing set() ::");
        System.out.println("To Replace element from certain index set() is used : ");
        System.out.println("Here, Replacing 11 by 69 at (0) index, arr.set(0 , 69) :");
        arr.set(0, 69);
        System.out.println(arr);

// To Remove element in ArrayList remove() is used
        System.out.println("\nUsing remove() ::");
        System.out.println("Used for Removing Elements in ArrayList according to given index :");
        System.out.println("Here, Removing 69 form index(0), arr.remove(0) :");
        arr.remove(0);
        System.out.println(arr);

        // To Remove element in ArrayList remove() is used
        System.out.println("\nUsing remove()  ::");
        System.out.println("Used for Removing Elements according to given element :");
        System.out.println("Here, Removing 77, arr.remove(Integer.valueOf(77)) :");
        arr.remove(Integer.valueOf(77));
        System.out.println(arr);

        // To Check if Element Exists
        System.out.println("\nUsing contains() ::");
        System.out.println("Used to Check if Element Exists in ArrayList : ");
        System.out.println("Here, Checking if 22 exists or not, arr.contains(22) : ");
        boolean b = arr.contains(22);

// or boolean b = arr.contains(Integer.valueOf(1));
        if (b) {
            System.out.println(b + ", Element exists !");
        } else System.out.println("Elements doesn't exists !");


// If you don't Specify class, you can put anything inside it t
        System.out.println("\nUsing Specify Class :: ");
        System.out.println("in Specify class you can declare elements of all Datatypes : ");
        ArrayList t = new ArrayList();
        t.add("Tushar");
        t.add(69);
        t.add(9.45);
        System.out.println(t);
    }
}
