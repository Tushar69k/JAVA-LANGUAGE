package PracticeWork.Methods.Strings;

import java.util.*;

public class FunctionOfString__1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Basics of String Input , Output , Copying String
        System.out.println("\nSTORING IN STRING AND GETTING OUTPUTS ------> ");
        String str = "HAAN JI , GOOD MORNING ?";
        String str2 = str; // Copying str to str2
        System.out.println(str2);

        //  next() and nextLine() Function
        System.out.println("\n Use of next() Function and nextLine() Function :: ");
        System.out.println(" ENTER YOUR FULL NAME : ");
        String FullName = sc.nextLine(); // nextLine() function used
        System.out.println("Your Aadhar Card name is : " + FullName);
        // The nexLine() function is used to store full sentence or String .
        System.out.println(" ENTER YOUR NICK NAME : ");
        String name = sc.next(); // next() function used
        System.out.println("Your Home name is : " + name);
        // This will terminate if we enter any space in between our input. used to store a single word .


// Use of charAt()
        System.out.println("\nUsing charAt() function of String :: ");
        String Food = "DALL BATTI";

        System.out.println("Our String is : " + Food);
        System.out.println("The Character at given Index ( i.e. 3 ) is : " + Food.charAt(3)); // charAt() Function used
// This will return Character of given Index

        // Use of length() function
        System.out.println("\nUsing length() for above String ( i.e. DALL BATTI ) : ");
        int length = Food.length();
        System.out.println("Length of your String is : " + length);


        // Using compareTo()
         /*
            Result will be as Follows ::
            0 if there is no difference in between
            +ve if 1st One is Greater than 2nd One
            -ve if 2nd One is Greater than 1st One

            Here 1st = alpha ( Calling Member )
            & 2nd = sigma ( Passed as Argument)
         */

        System.out.println("\nUsing compareTo() function for same String :: ");
        String alpha = "Male";
        String sigma = "Male";
        int res = alpha.compareTo(sigma);
        System.out.println("The result of comparision between 2 same strings is : " + res);
// If the compared string is same it will return 0 .

        System.out.println("\nUsing compareTo() function of greater to lesser String :: ");
        String alpha1 = "Meep growing";
        String sigma1 = "Keep growing";
        int res1 = alpha1.compareTo(sigma1);
        System.out.println("The result of comparision between greater to lesser String is : " + res1);
        //This will Return +ve 2 b'coz alpha1 is 2 greater than sigma1
        // b'coz M comes after K ( have 2 letter difference )


        System.out.println("\nUsing compareTo() function of lesser to greater String :: ");
        String alpha2 = "Deep growing";
        String sigma2 = "Keep growing";
        int res2 = alpha2.compareTo(sigma2);
        System.out.println("The result of comparision between lesser to greater String is : " + res2);
        //   This will Return -ve 7 b'coz alpha2 is 7 lesser than sigma2
        // b'coz k comes after d ( have 7 letter difference )

// Use of indexOf()
        System.out.println("\n Using indexOf() function :: ");
        System.out.println("Enter String with have to Perform this Function : ");
        String illuminati = sc.next();
        System.out.println("Enter the Character of your String whose Index you want to find : ");
        String find = sc.next();
        System.out.println("The Index of Given Character is : " + illuminati.indexOf(find));
        if (illuminati.indexOf(find) == -1) {
            System.out.println("is not available in String ");
        }
        String happy = "Happy";
        System.out.println(" For Example :: Taking Another String (" + happy + ") :: ");
        System.out.println("If our string contains same letter then the Index is Shown for the letter that" +
                " will come first .\n Here, the index at p will be : " + happy.indexOf('p'));


//        String t = "tush ";
//        String y = "don";
//         t = t.concat(y);
//        System.out.println(t);
//        System.out.println( t.concat(y));

    }
}
