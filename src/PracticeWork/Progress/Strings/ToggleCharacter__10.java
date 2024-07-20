/*Question : Toggle all the characters of String  i.e convert Upper case to Lower case and vise versa.
Ex : (input)phySics to PHYsics(output)
Asci values : A = 65 , a = 97 */
package PracticeWork.Progress.Strings;

import java.util.*;

public class ToggleCharacter__10 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        StringBuilder str = new StringBuilder(SetString());
        GetString(String.valueOf(str));
        ToggleString(String.valueOf(str));
        Toggle(str);
    }

    public static StringBuilder SetString() {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter String : ");
        StringBuilder str = new StringBuilder(tush.nextLine());
        return str;
    }

    public static void GetString(String str) {
        System.out.println("Entered String is : " + str);
    }

    public static void Toggle(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // true = capital
            char ch = str.charAt(i);

            int asci = (int) ch; // typecast

            if (asci >= 97) flag = false; // false = small

            if (ch == ' ') continue;

            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            } else if (flag == false) {
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }

        }
        System.out.println("\nToggle through String Builder ::");
        System.out.print("Toggle : " + str);
    }

    public static void ToggleString(String str) {
        System.out.println("\nToggle through String ::");
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // true = capital
            char ch = str.charAt(i);

            int asci = (int) ch; // typecast

            if (asci >= 97) flag = false; // false = small

            if (ch == ' ') continue;

            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else if (flag == false) {
                asci -= 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }

        }
        System.out.print("Toggle : " + str);
    }


}


