package PracticeWork.CodeWithHarry.Methods;

import java.util.*;

public class CelsiusToFahrenheit__9 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        int button;
        System.out.println("\n\t\t\t\t\t\t:: Program to Convert °C to °F and °F to °c ::\n");
        System.out.println(" 1. Converting Celsius to Fahrenheit ");
        System.out.println(" 2. Converting Fahrenheit to Celsius ");
        System.out.println(" 3. Both  ");
        System.out.println(" 4. Ending Program ");
        do {
            System.out.print("\nEnter Condition no. from above to perform Calculation : ");
            button = tush.nextInt();

            switch (button) {
                case 1:
                    System.out.print("Enter Celsius Degree : ");
                    double cel = tush.nextDouble();
                    System.out.println(cel + "° C = " + CelToFerh(cel) + "° F");
                    break;

                case 2:
                    System.out.print("Enter Fahrenheit Degree : ");
                    double fah = tush.nextDouble();
                    System.out.println(fah + "° F = " + CelToFerh(fah) + "° C");
                    break;

                case 3:
                    System.out.print("Enter Celsius Degree: ");
                    cel = tush.nextDouble();
                    System.out.println(cel + "° C = " + CelToFerh(cel) + "° F");
                    System.out.print("Enter Fahrenheit Degree : ");
                    fah = tush.nextDouble();
                    System.out.println(fah + "° F = " + FerhToCel(fah) + "° C");
                    break;

                case 4:
                    System.out.println(" Program Ended ");
                    break;

                default:
                    System.out.println("Brother , There are only 4 Conditions, Which Condition no. have you written? ");
                    break;
            }
        } while (button != 4);

    }

    public static double CelToFerh(double Cel) {
        return ((Cel * 9) / 5) + 32;
    }


    public static double FerhToCel(double Ferh) {
        return ((Ferh - 32) * 5) / 9;
    }


}
// Formula :- (°C × 9)/5 + 32 = °F
// (°C × 9/5) + 32 = °F
//(°F − 32) x 5/9 = °C




