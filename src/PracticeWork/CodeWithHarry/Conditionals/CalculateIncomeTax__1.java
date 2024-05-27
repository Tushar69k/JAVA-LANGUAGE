/*Question : Calculate Income tax paid by an employee to government as per
        the slobs mentioned below :

        Income Slob               Tax
        0.0 L - 2.5 L              0 %
        2.5 L - 5.0 L              5 %
        5.0 L - 10.0 L            20 %
        Above 10.0 L              30 %

        Note : There is mp tax below 2.5 L . Take input amount as input from user*/

package PracticeWork.CodeWithHarry.Conditionals;

import java.util.*;

public class CalculateIncomeTax__1 {
    public static void main(String[] args) {
        Scanner tush = new Scanner(System.in);
        System.out.print("Enter your Income in Lakhs per annum : ");
        float income = tush.nextFloat();

        float tax = 0;

        if (income <= 2.5f) {
            tax = tax + 0;
            System.out.println("The tax for Income " + income + " is : " + tax);

        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            System.out.println("The tax for Income " + income + " is : " + tax);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            System.out.println("The tax for Income " + income + " is : " + tax);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
            System.out.println("The tax for Income " + income + " is : " + tax);

        }
    }
}
