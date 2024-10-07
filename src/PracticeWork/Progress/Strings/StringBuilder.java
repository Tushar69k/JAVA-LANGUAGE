/* Usage of String Builder :
1. We can change characters in String Builder where we can't do this is normal String
2. We can Append String , characters , int etc.*/
package PracticeWork.Progress.Strings;

import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        // Use of append()
        System.out.println("Here, i used append() to merge to Strings ::");
        java.lang.StringBuilder str = new java.lang.StringBuilder("Welcome Bhairava!");
        str.append(" Here you Go Now !\n");
        System.out.println(str);

        // Use of CharAt()
        System.out.println("Here, i used CharAt() to replace 'W' to 'B' ::");
        str.setCharAt(0, 'B');
        System.out.println(str);
        str.setCharAt(0, 'W');//replacing 'B' to 'W' again


        // Use of insert()
        System.out.println("Here, i use insert() function to insert ('Bujji reporting.') at index 18 ::");
        str.insert(18, "Bujji reporting. ");
        System.out.println(str);


        // Use OF delete()
        System.out.println("Here, i deleted ('Bujji reporting.') from index 18 to 35 by using delete() function ::");
        str.delete(18, 35);
        System.out.println(str);


        // USe of reverse()
        System.out.println("Here, i used reverse() to reverse our String ::");
        str.reverse();
        str.delete(0, 1); // here, i used delete() to remove line gap (\n) because the String is reversed , our String i starting from /n.
        System.out.println(str);

        // Again Reversing
        System.out.println("\nAgain Reversing :: ");
        str.reverse();
        str.append("\n");
        System.out.println(str);

    }
}
