//Rock Paper Scissors Game
package PracticeWork.Fun_Codes;

import java.util.*;

public class Rock_Paper_Scissors__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.println("\n\t\t\t:: ROCK , PAPER , SCISSORS ::");
        int UserInput;
        System.out.println(" 1. Select ROCK \n 2. Select PAPER \n 3. Select SCISSORS \n 4. Select Close Game");

        do {
            System.out.print("Your Choice : ");
            UserInput = tush.nextInt();
//            System.out.println();
            if (UserInput == 1) {
                System.out.print("( You Selects Rock )");
            }

            if (UserInput == 2) {
                System.out.print("( You Selects Paper )");
            }

            if (UserInput == 3) {
                System.out.print("( You Selects Scissors )");
            }

            if (UserInput == 4) {
                System.out.println(" GAME ENDED ");
            }

            Random random = new Random();
            int ComInput = random.nextInt(1, 4);

            if (UserInput != 4) {
                if (ComInput == 1) {
                    System.out.print("( Computer Selects Rock )");
                }

                if (ComInput == 2) {
                    System.out.print("( Computer Selects Paper )");
                }

                if (ComInput == 3) {
                    System.out.print("( Computer Selects Scissors )");
                }
            }

            System.out.println();

            if (UserInput == ComInput) {
                System.out.println(" Match Draw ! ");
            } else if (UserInput == 1 && ComInput == 3 || UserInput == 2 && ComInput == 1 || UserInput == 3 && ComInput == 2) {
                System.out.println(" Hurray ! You Win ");
            } else if (UserInput == 1 && ComInput == 2 || UserInput == 2 && ComInput == 3 || UserInput == 3 && ComInput == 1) {
                System.out.println(" Computer Wins ! ");
            }
            if (UserInput != 4) {
                System.out.println("\n Wanna Try again ? If No Enter 4 ");
            }
        } while (UserInput != 4);

    }
}
