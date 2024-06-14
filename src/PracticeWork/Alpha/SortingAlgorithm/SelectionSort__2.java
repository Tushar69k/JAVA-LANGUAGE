package PracticeWork.Alpha.SortingAlgorithm;

import java.util.*;

public class SelectionSort__2 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);

        int[] arr = Setarr();
        GetArr(arr);
        SelectionSortAscending(arr);
        SelectionSortDescending(arr);
    }

    public static int[] Setarr() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = tush.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements of Array :: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + (i + 1) + "] : ");
            arr[i] = tush.nextInt();
        }
        return arr;
    }

    public static void GetArr(int[] arr) {
        System.out.println("\nElements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.print(" | \n");
    }


    public static void SelectionSortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\n  Selection Sort Ascending :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }

    public static void SelectionSortDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\n  Selection Sort Descending :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println(" | ");
    }
}
/*

Dry Run :

Our Array :  | 3 | 2 | 4 | 5 | 1 |
Index :         0   1   2   3   4


1st Iteration :
For 1st iteration i = 0 ; min = i = 0 ; j = i + 1 = 1

         if (arr[min] > arr[j]) {
                    min = j;
                }

                so here ,
                arr[ 0 ]  > arr[ 1 ]
                3   >   2   ( true )
  so , min = j (i.e) 1

                //
now ,
                arr[ 1 ] > arr[ 2 ]
                2   >   4  ( Not true )
now ,
                    arr[ 1 ] > arr[ 3 ]
                2   >   5  ( Not true )
now ,
                     arr[ 1 ] > arr[ 4 ]
                2   >   1  ( true )
                so , min = j (i.e) 4

now ,
    arr[ 4 ] = 1 and arr[ 0 ] = 3
 int temp = arr[min];        temp = arr[ 4 ];
   arr[min] = arr[i];         arr[ 4 ] = arr [ 0 ];
    arr[i] = temp;            arr [ 0 ] = temp( arr [4 ] )

    after this arr[ 4 ] = 3 and arr[ 0 ] = 1





So after 1st iteration our Array will be :

Our Array :  | 1 | 2 | 4 | 5 | 3 |
Index :         0   1   2   3   4

2nd Iteration :
For 2nd iteration i = 1 ; min = i = 1 ; j = i + 1 = 2

  if (arr[min] > arr[j]) {
                    min = j;
                }

                so here ,
                arr[ 1 ]  > arr[ 2 ]
                2   >   4   ( Not true )
now ,
                arr[ 1 ] > arr[ 3 ]
                2   >   5  ( Not true )
now ,
                    arr[ 1 ] > arr[ 4 ]
                2   >   3  ( Not true )

 No change will happen





So after 2nd iteration our Array will be :

Our Array :  | 1 | 2 | 4 | 5 | 3 |
Index :         0   1   2   3   4

3rd Iteration :
For 3rd iteration i = 2 ; min = i = 2 ; j = i + 1 = 3

  if (arr[min] > arr[j]) {
                    min = j;
                }

                so here ,
                arr[ 2 ]  > arr[ 3 ]
                4   >   5   ( Not true )
now ,
                arr[ 2 ] > arr[ 4 ]
                4   >   3  ( true )
  so , min = j (i.e) 4

now ,
    arr[ 4 ] = 3 and arr[ 2 ] = 4
 int temp = arr[min];        temp = arr[ 4 ];
   arr[min] = arr[i];         arr[ 4 ] = arr [ 2 ];
    arr[i] = temp;            arr [ 2 ] = temp( arr [ 4 ] )

    after this arr[ 4 ] = 4 and arr[ 2 ] = 3





So after 3rd iteration our Array will be :

Our Array :  | 1 | 2 | 3 | 5 | 4 |
Index :         0   1   2   3   4

4th Iteration :
For 4th iteration i = 3 ; min = i = 3 ; j = i + 1 = 4

 if (arr[min] > arr[j]) {
                    min = j;
                }

                so here ,
                arr[ 3 ]  > arr[ 4 ]
                5   >   4   ( true )
so , min = j (i.e) 4

now ,
    arr[ 4 ] = 4 and arr[ 3 ] = 5
 int temp = arr[min];        temp = arr[ 4 ];
   arr[min] = arr[i];         arr[ 4 ] = arr [ 3 ];
    arr[i] = temp;            arr [ 3 ] = temp( arr [ 4 ] )

    after this arr[ 4 ] = 5 and arr[ 3 ] = 4

So after 4th iteration our Array will be :

Our Array :  | 1 | 2 | 3 | 4 | 5 |
Index :         0   1   2   3   4

This is our Resulted Array




 */



